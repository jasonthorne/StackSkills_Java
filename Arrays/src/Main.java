import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int[] intArray1 = {2,4,5,8};
        int[] intArray2 = new int[4];
        intArray2[0] = 12;
        intArray2[1] = 13;
        intArray2[2] = 45;
        intArray2[3] = 23;


        String[] strArray = {"fee", "fi", "fo", "fum"};
        Boolean [] boolArray = {true, false, true, true};

        /*
        for (int i = 0; i < intArray1.length; i++) {
            System.out.println(intArray1[i] + " " + strArray[i] + " " + boolArray[i]);

       }*/

        ////////////////////////////////
        //ArrayLists

        ArrayList<String> animals = new ArrayList<String>(); //'animals' arraylist of type string
        animals.add("Dog");
        animals.add("Monkey");
        animals.add("Cat");
        animals.add("Donkey");

        System.out.println("Size: " + animals.size());

        /*if (animals.contains("Cat")){
            animals.remove("Cat");
        }else{
            animals.add("Chicken");
        }*/

        if (animals.isEmpty()){
            System.out.println("Empty array");
        }else{
            for(String animal : animals){
                System.out.println("Animal: " + animal);
            }
        }















    }
}
