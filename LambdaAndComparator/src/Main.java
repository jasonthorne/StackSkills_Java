import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

        List<Product> list = new ArrayList<>();

        //add products:
        list.add(new Product(1, "HP laptop", 500));
        list.add(new Product(2, "Experia play", 200));
        list.add(new Product(3, "Android phone", 200));
        list.add(new Product(4, "TV", 800));

        System.out.println("Sorting on the basis of name:");

        //call the collections interface to sort list by name (using lambda):
        Collections.sort(list, Comparator.comparing(p -> p.name)); //compares p to p.name (apparently! :D)

        //print out list items:
        for (Product p: list){
            System.out.println(p.id + " " + p.name + " " + p.price);
        }

    }
}
