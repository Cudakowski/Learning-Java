import java.util.Collection;
import java.util.Iterator;

public class LibraryUtils {
    static <T> void printItems(Collection<T> a)
    {
        Iterator<T> i =a.iterator();
        while (i.hasNext()) {
            var item = i.next();
            System.out.println(item);
        }
    }
}
