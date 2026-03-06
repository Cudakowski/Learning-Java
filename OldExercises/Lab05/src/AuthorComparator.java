import java.util.Comparator;

public class AuthorComparator implements Comparator<Book>{
//Sortuj po autorze i wypisz
//Book{isbn='222-1111111111', title='Thinking in Java', author='Bruce Eckel', publicationYear=2000}
//Book{isbn='111-4444444444', title='Effective Java', author='Joshua Bloch', publicationYear=2005}
//Book{isbn='978-0132350884', title='Clean Code', author='Robert C. Martin', publicationYear=1987}
    public int compare(Book a,Book b)
    {
        return (a.getAuthor().compareTo( b.getAuthor()));
    }
}
