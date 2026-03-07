import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductProcessor {
    List<Product> list;

    ProductProcessor(List<Product> list){
        this.list=list;
    }

    List<Product> filterProductsAboveAveragePrice(){
        double average = list.stream().collect(Collectors.averagingDouble(Product::getPrice));
        return list.stream().filter(a -> a.getPrice() > average).toList();
    }


    Map<String,List<Product>> groupByCategory(){
        return list.stream().collect(Collectors.groupingBy(Product::getCategory));
    }

    List<Product> sortByPriceDescending(){
        
        return list.stream().sorted(Comparator.comparing(Product::getPrice)).toList().reversed();
 
    }

//========== ŚREDNIA CENA W KATEGORIACH ==========
//Akcesoria komputerowe: 163,99 zł
//Audio: 506,75 zł
//Elektronika: 2932,66 zł
    Map<String,Double> calculateAveragePriceByCategory(){
        Map<String,List<Product>> map = groupByCategory();
        Map<String,Double> r =new HashMap<>();


        
        map.forEach((k,v) -> {
            r.put(k, v.stream().collect(Collectors.averagingDouble(Product::getPrice)));
        });

        return r;
    }

    Map<String,Product> findMostExpensiveByCategory(){
        Map<String,List<Product>> map = groupByCategory();
        Map<String,Product> r =new HashMap<>();


        
        map.forEach((k,v) -> {
            r.put(k, v.stream().max(Comparator.comparing(Product::getPrice)).get());
        });
        
        return r;
    }


    void printProductStats(){
        list.forEach(prod ->{
            System.out.println(prod.getName());
        });

        System.out.println("\nStatystyki produktow:");
        System.out.println("Liczba produktów: "+list.size());
        System.out.println("Cena minimalna: "+ list.stream().min(Comparator.comparing(Product::getPrice)).get().getPrice());
        System.out.println("Cena maksymalna: "+ list.stream().max(Comparator.comparing(Product::getPrice)).get().getPrice());
        System.out.println("Srednia cena: "+list.stream().collect(Collectors.averagingDouble(Product::getPrice)));
        System.out.println("Suma cen: "+list.stream().collect(Collectors.summingDouble(Product::getPrice)));

        System.out.println("\nLiczba produktów w kategoriach:");
        Map<String,List<Product>> map = groupByCategory();
        map.forEach((k,v) ->{
            System.out.println(k+": "+v.size());
        });
        

    }

}
