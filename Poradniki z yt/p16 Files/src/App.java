import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        //Do pliku:
        //FileWriter(samll/medium files), BufferedWriter(large trext), PrintWrtier(structured data: reports, logs), FileOutputStream(binary files)
        
        String filePath =".\\texts\\test.txt";
        String textContent = """
                Makapaka
                akałaka
                """;//ŁAŁ! to dodaje nawet znaki nowej linii

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
            System.out.println("zapisao");
        } catch (FileNotFoundException e) {
            System.out.println("nie znalazo plyku");
        } 
        catch (IOException e) {
            System.out.println("nie da sie zapisac plykuuu");
        }


        //Z pliku:
        //BufferedReader + FileReader(line by line)
        //FileInputStream(for binary)
        //RandomAccessFile(read/write specyfic portions of a large file)

        

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            System.out.println("plyk istnieje");

            String line;
            while((line=reader.readLine()) !=  null)
            {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("nie znalazo plyku");
        }
        catch (IOException e){
            System.out.println("cos poszlo zle");
        }
    }
}
