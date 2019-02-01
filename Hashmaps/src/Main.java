import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap users = new HashMap(); //+++IMPORTANT: hashmaps have key and value pairs.

        users.put("Bob", 34); //"Bob" is the key. "34" is the value
        users.put("Jeff", 66);

        if (users.containsKey("Jeff")){
            System.out.println("Jeff is here!");
        }

        System.out.println("Bobs value is: " + users.get("Bob"));

        System.out.println("All values: " + users.values());
        System.out.println("All keys and values:" + users.entrySet());

        //loop through Hashmap with iterator
        Iterator it = users.entrySet().iterator();

        while(it.hasNext()){ //while 'it' is pointing to another value in hashmap
           Map.Entry pair = (Map.Entry) it.next(); //cast 'it.next' to be of type 'map entry'. Map is a higher level collections class.
            //'pair' of type 'Map.entry' now has everything thats inside of 'users' hashmap.

            System.out.println(pair.getKey() + " = " + pair.getValue());
        }



        //////////////////////////

        HashMap<String, Integer> newUser = new HashMap<String, Integer>(); //Hashmap with string keys and int values ONLY.

        newUser.put("Sue", 11);
        System.out.println(newUser.get("Sue"));











    }
}
