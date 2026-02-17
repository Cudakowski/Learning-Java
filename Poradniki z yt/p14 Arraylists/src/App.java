import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(1);
        list.add(5);

        list.remove(0);

        list.set(0, 6);

        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());

        Collections.sort(list);
        System.out.println(list);

        for(Integer i : list)
        {
            System.out.println(i);
        }
    }
}
