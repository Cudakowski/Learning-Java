public class CloneTester {
    static void testCloning(TextEntity ent){
        // Oryginalny obiekt: TextEntity{id=1, language='pl', content='Przykładowy tekst'}
        // Sklonowany obiekt: TextEntity{id=1, language='pl', content='Przykładowy tekst'}
        // Czy to ten sam obiekt? false
        // Czy obiekty są równe? true
        // HashCode oryginalnego: 657230859
        // HashCode sklonowanego: 657230859

        TextEntity cloned;
        try {
            cloned = (TextEntity)ent.clone();
            System.out.println("Oryginalny obiekt: TextEntity{id="+ent.id+", language='"+ent.jezyk+"', content='"+ent.tekst+"'}");
            System.out.println("Sklonowany obiekt: TextEntity{id="+cloned.id+", language='"+cloned.jezyk+"', content='"+cloned.tekst+"'}");
            System.out.println("Czy to ten sam obiekt? "+(cloned==ent));
            System.out.println("Czy obiekty są równe? "+(cloned.equals(ent)));
            System.out.println("HashCode oryginalnego: "+ent.hashCode());
            System.out.println("HashCode sklonowanego: "+cloned.hashCode());
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning Failed: "+e.getMessage());
        }
        

        
    }
}
