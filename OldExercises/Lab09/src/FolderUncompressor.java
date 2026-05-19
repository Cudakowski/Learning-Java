import java.io.File;
//Zaprogramuj unkompressor zip, który jako parametry z linii komend przyjmie folder źródłowy oraz folder docelowy.
//Pliki w folderze źródłowym (nazwijmy go compressed to te same pliki, które poprzednio zostały skompresowane) zostaną rozzipowane,
// i zapisane w folderze docelowym (nazwijmy go uncompressed).
//Rozzipowanie każdego pliku musi odbyć się w oddzielnym wątku wykonującym zadanie UncompressingTask implementujące interfejs
// Runnable (uwaga: to niejest zaznaczone na diagramie UML) i skutkować:
//1. Outputem jak poniżej.
//2. Zapisaniem plików w folderze uncompressed
public class FolderUncompressor {
    public static void main(String[] args) {
//        ???
        if(args.length<2){
            System.out.println("Błędne wywołanie");
            System.out.println("Wywołuje się: java ./program [sourcePath] [destPath]");
            return;
        }
        String sourcePath=args[0];
        String destPath=args[1];

        File sourceFolder = new File(sourcePath);
        if(!sourceFolder.exists() || !sourceFolder.isDirectory()){
            System.out.println("Folder źródłowy nie istnieje bądź nie jest folderem");
            return;
        }
        
        File destFolder = new File(destPath);
        if(!destFolder.exists()){
            destFolder.mkdir();
        }

        File[] files = sourceFolder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".zip")) {
                    UncompressingTask task = new UncompressingTask(file, destPath);
                    Thread thread = new Thread(task);
                    thread.start();
                }
            }
        }
    }
}

//Archiwum Angular2_Succinctly.pdf.zip rozpakowane przez wątekThread-0. Rozmiar archiwum: 1,9 MB, rozmiar po rozpakowaniu: 2,1 MB
//Archiwum Android-UI-Design.pdf.zip rozpakowane przez wątekThread-2. Rozmiar archiwum: 3,4 MB, rozmiar po rozpakowaniu: 3,9 MB
//Archiwum Android-Programming-Cookbook.pdf.zip rozpakowane przez wątekThread-1. Rozmiar archiwum: 8,0 MB, rozmiar po rozpakowaniu: 8,6 MB
