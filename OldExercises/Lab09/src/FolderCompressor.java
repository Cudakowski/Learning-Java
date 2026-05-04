import java.io.File;
import java.util.Scanner;
//Zaprogramuj kompressor zip, który jako parametry z linii komend przyjmie folder źródłowy oraz folder docelowy.
//Pliki w folderze źródłowym (nazwijmy go to_compress i zawiera on dostarczone pliki) zostaną zzipowane,
// oddzielnie plik po pliku i zapisane w folderze docelowym.
//Zipowanie każdego pliku musi odbyć się w oddzielnym wątku wykonującym zadanie CompressingTask implementujące interfejs
// Runnable (uwaga: to niejest zaznaczone na diagramie UML) i skutkować:
//1. Outputem jak poniżej.
//2. Zapisaniem plików w folderze compressed
public class FolderCompressor {
    public static void main(String[] args) {
//        ???
        String sourcePath;
        String destPath;
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Podaj folder źródłowy: ");
            sourcePath = scanner.nextLine();
            System.out.print("Podaj folder docelowy: ");
            destPath = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Input Exception");
        }


    }
}
//
//Plik Angular2_Succinctly.pdf zzipowany w wątku Thread-1. Rozmiar początkowy: 2,1 MB,rozmiar końcowy: 1,9 MB
//Plik Android-UI-Design.pdf zzipowany w wątku Thread-2. Rozmiar początkowy: 3,9 MB,rozmiar końcowy: 3,4 MB
//Plik Android-Programming-Cookbook.pdf zzipowany w wątku Thread-0. Rozmiar początkowy: 8,6 MB,rozmiar końcowy: 8,0 MB

