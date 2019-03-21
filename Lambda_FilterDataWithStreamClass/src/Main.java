import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Product{
    int id;
    String name;
    float price;

    //constructor
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}


public class Main {

    public static void main(String[] args) {

        //list for holding product objects:
        List<Product> myList = new ArrayList<>();

        //add product objects to list:
        myList.add(new Product(1, "HP laptop", 5000));
        myList.add(new Product(2, "Experia play", 200));
        myList.add(new Product(3, "Android phone", 200));
        myList.add(new Product(4, "TV", 8000));

        //stream is a generic interface, which accepts objects of any type ('Product' in this case).
        Stream<Product> filteredData = myList.stream().filter( (product) -> product.price > 1000); //Stream obj 'filteredData' holds  all products that have a price > 1000

        System.out.println("Filter applied:");

        //for each product in filteredData, print its name and price:
        filteredData.forEach( (product) -> System.out.println("name: " + product.name + ". Price: " + product.price)); //REMEMBER: '{product}' is our created parameter! (same with '.filter' invocation above)


    }
}
