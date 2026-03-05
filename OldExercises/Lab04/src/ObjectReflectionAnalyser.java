import java.lang.reflect.Method;

public class ObjectReflectionAnalyser {
    static void analyzeObject(Object obj){
        // Analizuję obiekt: TextEntity{id=1, language='pl', content='Przykładowy tekst'}
        // Nazwa klasy: TextEntity
        // Klasa nadrzędna: java.lang.Object
        // Czy to interfejs? false
        // Dostępne metody:
        // - equals
        // - toString
        // - hashCode
        // - ... i 2 więcej metod
        // Czy to TextEntity? true
        // Czy to String? false
        // Czy to Cloneable? true
        // Czy to Comparable? false

        // Analizuję obiekt: To jest zwykły String
        // Nazwa klasy: java.lang.String
        // Klasa nadrzędna: java.lang.Object
        // Czy to interfejs? false
        // Dostępne metody:
        // - value
        // - equals
        // - length
        // - ... i 148 więcej metod
        // Czy to TextEntity? false
        // Czy to String? true
        // Czy to Cloneable? false
        // Czy to Comparable? true

        System.out.println("Analizuję obiekt: "+obj);
        System.out.println("Nazwa klasy: "+obj.getClass().getTypeName());
        System.out.println("Klasa nadrzędna: "+obj.getClass().getSuperclass().getName());
        System.out.println("Dostępne metody:");
        Method[] l= obj.getClass().getDeclaredMethods();
        System.out.println(" - "+l[0].getName());
        System.out.println(" - "+l[1].getName());
        System.out.println(" - "+l[2].getName());
        System.out.println(" - ... i "+(l.length-3)+" więcej metod");
        System.out.println("Czy to TextEntity? "+(obj instanceof TextEntity));
        System.out.println("Czy to String? "+(obj instanceof String));
        System.out.println("Czy to Cloneable? "+(obj instanceof Cloneable));
        System.out.println("Czy to Comparable? "+(obj instanceof Comparable));

        System.out.println();
    }
}
