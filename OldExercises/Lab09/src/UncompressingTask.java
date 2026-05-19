import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UncompressingTask implements Runnable {
    private String destFolder;
    private File f;
    public UncompressingTask(File f, String destFolder){
        this.destFolder=destFolder;
        this.f=f;
    }

    @Override
    public void run(){
        long archiveSizeBytes = f.length();
        long uncompressedSizeBytes = 0;

        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(f))) {
            ZipEntry zipEntry = zipInputStream.getNextEntry();
            
            if (zipEntry != null) {
                String filePath = destFolder + File.separator + zipEntry.getName();
                File extractedFile = new File(filePath);

                try (FileOutputStream fileOutputStream = new FileOutputStream(extractedFile)) {
                    byte[] buffer = new byte[4096];
                    int length;
                    while ((length = zipInputStream.read(buffer)) > 0) {
                        fileOutputStream.write(buffer, 0, length);
                    }
                }
                
                uncompressedSizeBytes = extractedFile.length();
            }
            zipInputStream.closeEntry();
        } catch (Exception e) {
            System.err.println("Błąd podczas dekompresji archiwum " + f.getName() + ": " + e.getMessage());
            return;
        }

        double archiveSizeMb = archiveSizeBytes / (1024.0 * 1024.0);
        double uncompressedSizeMb = uncompressedSizeBytes / (1024.0 * 1024.0);

        String threadName = Thread.currentThread().getName();

        System.out.printf(Locale.forLanguageTag("pl-PL"), 
                "Archiwum %s rozpakowane przez wątek%s. Rozmiar archiwum: %.1f MB, rozmiar po rozpakowaniu: %.1f MB%n",
                f.getName(), threadName, archiveSizeMb, uncompressedSizeMb);
    }
}

//Archiwum Angular2_Succinctly.pdf.zip rozpakowane przez wątekThread-0. Rozmiar archiwum: 1,9 MB, rozmiar po rozpakowaniu: 2,1 MB
//Archiwum Android-UI-Design.pdf.zip rozpakowane przez wątekThread-2. Rozmiar archiwum: 3,4 MB, rozmiar po rozpakowaniu: 3,9 MB
//Archiwum Android-Programming-Cookbook.pdf.zip rozpakowane przez wątekThread-1. Rozmiar archiwum: 8,0 MB, rozmiar po rozpakowaniu: 8,6 MB