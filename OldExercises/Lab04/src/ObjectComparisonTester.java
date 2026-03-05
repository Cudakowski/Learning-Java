import java.util.HashSet;

public class ObjectComparisonTester {
    static void compareObjects(TextEntity t1, TextEntity t2, TextEntity t3){
        // t1.equals(t2): true
        // t1.equals(t3): false
        // t1.hashCode(): 657230859
        // t2.hashCode(): 657230859
        // t3.hashCode(): 527796934
        // Rozmiar HashSet: 2
        // Zawartość HashSet: [TextEntity{id=3, language='en', content='Example text'}, TextEntity{id=1, language='pl', content='Przykładowy tekst'}]

        System.out.println("t1.equals(t2): "+t1.equals(t2));
        System.out.println("t1.equals(t3): "+t1.equals(t3));
        System.out.println("t1.hashCode(): "+t1.hashCode());
        System.out.println("t2.hashCode(): "+t2.hashCode());
        System.out.println("t3.hashCode(): "+t3.hashCode());

        HashSet<TextEntity> h=new HashSet<>();
        h.add(t1);
        h.add(t2);
        h.add(t3);

        System.out.println("Rozmiar HashSet: "+h.size());
        System.out.print("Zawartość HashSet: "+h);
        System.out.println();
        
    }
}
