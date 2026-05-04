package com.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    private final String FILE_NAME = "zadania.txt";
    private ObservableList<String> tasks;
    private ListView<String> listView;
    private TextField taskInput;
    private Label statusLabel;

    @Override
    public void start(Stage stage) {

        
        tasks = FXCollections.observableArrayList();
        listView = new ListView<>(tasks);
        taskInput = new TextField();
        taskInput.setPromptText("Wpisz treść zadania...");
        statusLabel = new Label("Status: Gotowy");

        
        loadTasksFromFile();

        Button addButton = new Button("Dodaj");
        addButton.setOnAction(e -> addTask());

        Button deleteButton = new Button("Usuń");
        deleteButton.setOnAction(e -> deleteTask());

        Button clearButton = new Button("Wyczyść");
        clearButton.setOnAction(e -> clearAllTasks());

        Button saveButton = new Button("Zapisz");
        saveButton.setOnAction(e -> saveTasksToFile());

        HBox inputLayout = new HBox(10, taskInput, addButton);
        inputLayout.setPadding(new Insets(5));

        HBox actionButtons = new HBox(10, deleteButton, clearButton, saveButton);
        actionButtons.setPadding(new Insets(5));

        VBox root = new VBox(10, new Label("Zadania:"), listView, inputLayout, actionButtons, statusLabel);
        root.setPadding(new Insets(15));

        Scene scene = new Scene(root, 400, 450);
        stage.setTitle("Lista ToDo");
        stage.setScene(scene);
        stage.show();
    }

    private void addTask() {
        String text = taskInput.getText().trim();
        if (!text.isEmpty()) {
            tasks.add(text);
            taskInput.clear();
            statusLabel.setText("Status: Dodano zadanie.");
        } else {
            statusLabel.setText("Status: Pole nie może być puste!");
        }
    }

    private void deleteTask() {
        int selectedIdx = listView.getSelectionModel().getSelectedIndex();
        if (selectedIdx != -1) {
            tasks.remove(selectedIdx);
            statusLabel.setText("Status: Usunięto zadanie.");
        } else {
            statusLabel.setText("Status: Wybierz zadanie do usunięcia.");
        }
    }

    private void clearAllTasks() {
        tasks.clear();
        statusLabel.setText("Status: Lista wyczyszczona.");
    }


    private void saveTasksToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String task : tasks) {
                writer.write(task);
                writer.newLine();
            }
            statusLabel.setText("Status: Zapisano do " + FILE_NAME);
        } catch (IOException e) {
            statusLabel.setText("Błąd zapisu: " + e.getMessage());
        }
    }

    private void loadTasksFromFile() {
        if (!Files.exists(Paths.get(FILE_NAME))) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                tasks.add(line);
            }
            statusLabel.setText("Status: Wczytano zadania.");
        } catch (IOException e) {
            statusLabel.setText("Błąd odczytu: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch();
    }

}
