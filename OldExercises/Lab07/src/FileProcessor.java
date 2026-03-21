import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileProcessor {
    private String inputFilePath;
    private String outputFilePath;

    public FileProcessor(String inputFilePath, String outputFilePath){
        this.inputFilePath=inputFilePath;
        this.outputFilePath=outputFilePath;
    }

    public void processFiles(){
        String summary = processFile();

        WriteSummaryToFile(summary);
    }

    private int processLine(String line, int lineNumber) throws InvalidDataException{
        if(line.isBlank()){
            throw new EmptyLineException("Empty line: Line "+lineNumber+" is empty or contains whitespace only.");
        }

        int a=0;


        try {
            a = Integer.parseInt(line);

        } catch (NumberFormatException e) {
            throw new NonNumericDataException("Non-numeric data: Line "+lineNumber+" contains non-numeric data: '"+line+"'",e);
        }
    

        
        return a;
    }

    private String processFile(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Reading data from file: "+inputFilePath+"\n");
        int sum=0;

        try (Scanner scanner=new Scanner(Paths.get(inputFilePath))) {
            int count=0;
            while (scanner.hasNextLine()) {
                count++;
                try  {
                    int a = processLine(scanner.nextLine(), count);
                    sum+=a;
                    stringBuilder.append("Line "+count+": "+a+" (Valid)\n");
                } catch (InvalidDataException e) {
                    stringBuilder.append("Line "+count+": Error - "+e.getMessage()+"\n");
                }
            }
            
            
        } catch (IOException e) {
            System.out.println("Nie otwarto pliku!");
        }

        stringBuilder.append("Total sum of valid numbers: "+sum+"\n");
        return stringBuilder.toString();
    }

    private void WriteSummaryToFile(String summary){
        try (FileWriter writer = new FileWriter(outputFilePath)) {
            
            writer.write(summary);

        } catch (IOException e) {
            System.out.println("Jakis blad z zapisanym plikiem!");
        }
    }
}
