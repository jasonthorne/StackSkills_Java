import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray1 = {2,4,5,8};
        int[] intArray2 = new int[4];
        intArray2[0] = 68;
        intArray2[1] = 13;
        intArray2[2] = 2;
        intArray2[3] = 1;

        String[] strArray = {"b", "ab", "aa", "c"};
        Boolean [] boolArray = {true, false, true, true};

        //sorting an array
        Arrays.sort(strArray); //'Arrays' is imported above!

        for(String element : strArray){
            System.out.println("element: " + element);
        }



        ////////////////////////////////
        //ArrayLists

        ArrayList<String> animals = new ArrayList<String>(); //'animals' arraylist of type string
        animals.add("Dog");
        animals.add("Monkey");
        animals.add("Cat");
        animals.add("Donkey");

        //System.out.println("Size: " + animals.size());

        if (animals.isEmpty()){
            System.out.println("Empty array");
        }else{
            for(String animal : animals){
                System.out.println("Animal: " + animal);
            }
        }















    }
}
