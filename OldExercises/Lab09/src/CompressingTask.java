import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CompressingTask implements Runnable {
    private String outFolder;
    private String fname;
    private File f;
    public CompressingTask(File f, String outFolder){
        this.f=f;
        this.fname=f.getName();
        this.outFolder=outFolder;
    }

    @Override
    public void run(){
        long initialSizeBytes = f.length();
        String filePath = outFolder + File.separator + fname + ".zip";
        File destFile = new File(filePath);

        try (FileOutputStream fileOutputStream = new FileOutputStream(destFile);
            ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
            FileInputStream fileInputStream = new FileInputStream(f)) {

            ZipEntry zipEntry = new ZipEntry(fname);
            zipOutputStream.putNextEntry(zipEntry);

            byte[] buffer = new byte[4096];
            int length;
            while ((length = fileInputStream.read(buffer)) > 0) {
                zipOutputStream.write(buffer, 0, length);
            }
            zipOutputStream.closeEntry();

        } catch (Exception e) {
            System.err.println("Błąd podczas kompresji pliku " + fname + ": " + e.getMessage());
            return;
        }

        long finalSizeBytes = destFile.length();
        double initialSizeMb = initialSizeBytes / (1024.0 * 1024.0);
        double finalSizeMb = finalSizeBytes / (1024.0 * 1024.0);

        String threadName = Thread.currentThread().getName();

        System.out.printf(Locale.forLanguageTag("pl-PL"), 
                "Plik %s zzipowany w wątku %s. Rozmiar początkowy: %.1f MB,rozmiar końcowy: %.1f MB\n",
                fname, threadName, initialSizeMb, finalSizeMb);
    }
}
//Plik Angular2_Succinctly.pdf zzipowany w wątku Thread-1. Rozmiar początkowy: 2,1 MB,rozmiar końcowy: 1,9 MB
//Plik Android-UI-Design.pdf zzipowany w wątku Thread-2. Rozmiar początkowy: 3,9 MB,rozmiar końcowy: 3,4 MB
//Plik Android-Programming-Cookbook.pdf zzipowany w wątku Thread-0. Rozmiar początkowy: 8,6 MB,rozmiar końcowy: 8,0 MB