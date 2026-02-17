public class App {
    public static void main(String[] args) throws Exception {
        //wrapping primitives in objects

        //Integer a = new Integer(123); // stara metoda
        Integer a = 123; //autoboxing
        Double b = 3.13; 
        Character c = 'k';
        Boolean d = true;
        String e = "kek"; //to też

        //unboxig

        int x =a;

        String fA = Integer.toString(123);
        String fB = Double.toString(3.13);
        String fC = Character.toString('k');
        String fD = Boolean.toString(false);

        System.out.println(fA+fB+fC+fD);

        int gA = Integer.parseInt("123");
        double gB = Double.parseDouble("3.13");
        char gC = "kek".charAt(0);
        boolean gD = Boolean.parseBoolean("false");

        System.out.println(Character.isLetter(c));
        System.out.println(Character.isUpperCase(c));
    }
}
