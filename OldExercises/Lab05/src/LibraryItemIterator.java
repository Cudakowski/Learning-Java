import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class LibraryItemIterator<T extends LibraryItem> implements Iterator<T> {
    private int curr;
    private List<T> l;

    LibraryItemIterator(List<T> l){
        this.l=l;
        curr=0;
    }

    @Override
    public T next() {
        

        if(hasNext()){
            return l.get(curr++);
        }
        else{
            throw new NoSuchElementException();
        }
    }

    @Override
    public boolean hasNext() {
        return curr<l.size();
    }

    @Override
    public void remove() {    
        l.remove(--curr);
    }
}
