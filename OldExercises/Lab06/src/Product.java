public class Product {
    private String name;
    private String category;
    private double price;


    Product(String name, double price, String category){
        this.name=name;
        this.price=price;
        this.category=category;
    }

    @Override
    public java.lang.String toString() {
        //Product{name='Laptop Dell XPS', price=5999,99, category='Elektronika'}
        return "Product{name='"+name+"', price="+price+", category='"+category+"'}";
    }

    String getName(){
        return name;
    }

    String getCategory(){
        return category;
    }

    double getPrice(){
        return price;
    }
}
