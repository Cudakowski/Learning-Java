public class App {
    public static void main(String[] args) throws Exception {
        
        
        Box<String> box = new Box<>();

        box.setItem("kek");

        System.out.println(box.getItem());


        Product<String, Double> product = new Product<>("bak",9.1);

        System.out.println(product.item);
    }
}
