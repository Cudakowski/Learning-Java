import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDocumentAdapter implements Document{
    TextDocument textDocument;
    public FileDocumentAdapter(String filepath) throws IOException{
        this.textDocument = readDocumentFromFile(filepath);
    }

    private TextDocument readDocumentFromFile(String filepath) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(filepath));

        TextDocument temp = new TextDocument("", "");

        temp.name = reader.readLine();

        while(reader.ready()){
            temp.data+=reader.readLine()+"\n";
        }
        reader.close();
        return temp;
    }

    @Override
    public void display() {
        System.out.println("Dokument: " + textDocument.name);
        System.out.println("Treść: " + getContent());
    }

    @Override
    public String getContent() {
        return textDocument.data;
    }
}
