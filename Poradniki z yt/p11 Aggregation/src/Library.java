public class Library {
    String name;
    Book[] books;

    Library(String name, Book[] books)
    {
        this.name=name;
        this.books=books;
    }

    void displayInfo()
    {
        System.out.println(name);
        for(Book book : books)
        {
            System.out.println(book.name);
        }
    }
}
