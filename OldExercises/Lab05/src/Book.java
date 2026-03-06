public class Book implements LibraryItem{
    private String isbn;
    private String title;
    private String author;
    private int publicationYear;
    private boolean available;
    private String type;


    Book(String isbn, String title, String author, int publicationYear)
    {
        this.isbn=isbn;
        this.title=title;
        this.author=author;
        this.publicationYear=publicationYear;
        available=true;
        type="kek";
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public String getId() {
        return isbn;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getType() {
        return type;
    }

    String getAuthor()
    {
        return author;
    }

    int getPublicationYear()
    {
        return publicationYear;
    }

    //Book{isbn='978-0132350884', title='Clean Code', author='Robert C. Martin', publicationYear=1987}
    @Override
    public String toString() {
        return "Book{isbn='"+isbn+"', title='"+title+"', author='"+author+"', publicationYear="+publicationYear+"}";
    }

    @Override
    public int hashCode() {
        int hash=7;
        hash=isbn.hashCode()*31;
        return hash;
    }

    void setAvailable(boolean available)
    {
        this.available=available;
    }

    @Override
    public boolean equals(Object obj) {
        if( this == obj)
            return true;

        if(!(obj instanceof Book))
            return false;

        return isbn==((Book) obj).isbn;
    }
}
