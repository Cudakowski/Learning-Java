public class App {
    public static void main(String[] args) throws Exception {
        Book book1 = new Book("pak");
        Book book2 = new Book("mak");

        Book[] books ={book1,book2};

        Library library = new Library("pibopeka", books);//agregacja
        library.displayInfo();
    }
}
