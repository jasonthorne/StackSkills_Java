import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        //Primitive variable types: int, char, long, float, double, boolean, byte etc...
        //All of these have corresponding object types which they can be converted to:
        //Integer, Character, Long, Float, Double, Boolean, Byte etc...

        int i = 32;
        //ArrayList myArray = new ArrayList();
        ArrayList<Integer> myArray = new ArrayList(); //Specifying array type (<Integer>) make autoboxing happen automatically
        myArray.add(i); //+++ this int then gets saved in array as an OBJECT +++

        int myItem;
        System.out.println(myItem = myArray.get(0));

        int b = 23;
        //Integer myObject = new Integer(b); //physically wrapping my int primitive variable
        //int recoverInt = myObject.intValue(); //unwrapping object back to primitive

        char myChar = 'b';

        //Character myCharacter = new Character(myChar); // wrapping char primitive in Character object
        //char recoverChar = myCharacter.charValue(); //unwrapping Character object back to char primitive
    }


}
