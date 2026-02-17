import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 2.0);
        map.put("kek", 22.0);
        map.put("bak", 25.0);
        System.out.println(map);

        map.put("kek", 5.99);
        System.out.println(map);

        map.remove("kek");
        System.out.println(map);

        System.out.println(map.get("apple"));

        System.out.println(map.containsKey("bak"));

        System.out.println(map.containsValue(2.0));

        System.out.println(map.size());

        for(String key : map.keySet())
        {
            System.out.println( key + " : " + map.get(key));
        }
    }
}
