import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class App {
    public static void main(String[] args) throws Exception {
        
        //.wav, .au, .aiff

        String filePath = "kek";

        File file = new File(filePath);

        try (Scanner scanner = new Scanner(System.in);
             AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {
            
            

            
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            System.out.println("no problems detected");
            
            //clip.start();
            String response="";
            while(!response.equals("Q"))
            {
                System.out.println("P=Play");
                System.out.println("S=Stop");
                System.out.println("R=Reset");
                System.out.println("Q=Quit");
                System.out.println("next choice: ");

                response =  scanner.next().toUpperCase();

                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("invalid input");
                }
            }
        } 
        catch(FileNotFoundException e)
        {
            System.out.println("could not locate file");
        }
        catch(UnsupportedAudioFileException e)
        {
            System.out.println("audiofile not supported");
        }
        catch (LineUnavailableException e)
        {
            System.out.println("unable to acces audio resource");
        }
        catch (IOException e) {
            System.out.println("something wrong");
        }
        finally
        {
            System.out.println("bye!");
        }
    }
}
