import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Java 'Sets' (a java collections type) allows for item collection without accepting duplicates

        //angular brackets as allows for generic types
        Set<Integer> set = new HashSet<Integer>(); //'Hashset' is an implementation of the 'set' interface
        //Set<Object> set = new HashSet<Integer>(); //Do this for undeclared generic objects. eg: 'set.add("potatoes")'
        int count[] = {3,6,5,41,6,9,10,23};

        //add array contents to set. (in a try as protective measure )
        try{

            for (int i = 0; i <count.length ; i++) {
                set.add(count[i]);
            }

            System.out.println("Set: " + set); //show set

            //++++Tree Set: +++++

            TreeSet sortedSet = new TreeSet(set); //adding just created set

            System.out.println("Sorted Tree set:" + sortedSet);


            //++++Linked Hash Set: +++++
            // Contains unique elements (like hashset),
            //Provides ALL optional set operations
            //ALLOWS Null values
            //Contains an insertion order

            LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

            linkedHashSet.add("Movie"); linkedHashSet.add("Potato");
            linkedHashSet.add("James"); linkedHashSet.add("Now");
            linkedHashSet.add("Java"); linkedHashSet.add("Belly Button Fluff");

            //Iterator class allows us to iterate through certain objects (IE collections)
            Iterator<String> iterator = linkedHashSet.iterator(); //'LinkedHashSet' has it's own iterator, so we use that during obj construction

            while (iterator.hasNext()){
                System.out.println("Item: " + iterator.next());
            }

            //System.out.println("Set: " + set);
           // System.out.println("Size: " + set.size());
            //set.remove(count[0]);
            //System.out.println("Set: " + set);
            //System.out.println("Size: " + set.size());

            /*
            if (set.contains(3)){
                System.out.println("Yeah dawg!");
            }else System.out.println("No Dice!");
            */

        }catch (Exception e){

        }

    }
}
