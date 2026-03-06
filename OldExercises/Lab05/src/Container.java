import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Container<T extends LibraryItem> implements Iterable<T> {

    private List<T> l;

    Container()
    {
        l=new ArrayList<>();
    }

    @Override
    public Iterator<T> iterator() {
        return new LibraryItemIterator<>(l);
    }

    List<T> getItems()
    {   
        return l;
    }

    void addItem(T a)
    {
        l.add(a);
    }

    T removeItem(String a)
    {
        Iterator<T> iter = iterator();
        while (iter.hasNext()) {
            T i = iter.next();
            if(i.getId()==a){
                iter.remove();
                return i;
            }
        }

        return null;
    }
}
