import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //+++++++++++++++++++++++++++++++++++++++++++++++++++1
        /*
        //Old way of instantiating a drawable obj:
        Drawable drawable1 = new Drawable() {
            @Override
            public void draw(int width, int height) { //Normally method needs declared and overriden++++++++
                System.out.println("Drawing...");
            }

        };//this colon needed adding!! +++++


        //invoke drawable method:
        drawable1.draw(33, 0);
*       */
        //+++++++++++++++++++++++++++++++++++++++++++2=

        /*
        //==============================================
        //Lambda way of instantiating a drawable obj:
        Drawable drawable2 = (width, height) ->{ //brackets for input params as usual
            System.out.println("Lambda Drawing..." + width + " " +  height);

        };//Dont forget this colon!! +++

        //invoke Lambda drawable method:
        drawable2.draw(23, 5);


        //=============================================
        */

        //###################################################

        Addable addable1 = (a,b)->(a+b); //passing a & b as params, declaring its method operation to be a + b
        //invoke addable method:
        System.out.println(addable1.add(1, 3));


        //Can also SPECIFY what input type to pass as params ('int a'):
        Addable addable2 = (int a, int b)->(a+b); //passing a & b as params, declaring its method operation to be a + b
        //invoke addable method:
        System.out.println(addable2.add(5, 3));

        //###################################################


        //''''''''''''''''''''''''''''''''''''''''''''''''''''

        //make an arrayList of String objects:
        List<String> nameList = new ArrayList<>();
        //add elements to list:
        nameList.add("Bob"); nameList.add("Frank"); nameList.add("Marge");

        //old (advanced for loop) way of spinning through list:
        for (String names : nameList){ //create a string var called 'names', assign it the value of the current element
            System.out.println(names); //then print elements value
        }

        //Lambda way:
        nameList.forEach( //for each element in list:
                (names) -> System.out.println(names) //create a var called names, and print its value
        );

        //''''''''''''''''''''''''''''''''''''''''''''''''''''


        //6666666666666666666666666666666666666666666666666666

        //create speakable obj from interface and define the body of its method:
        Speakable speakable = (message) -> { //'(message)' is an input param. Braces are needed here as body contains multiple elements (wouldnt be if just one like 'addable1 & 2' above)
            String message2 = "Yo";
            String message3 = message + message2 + " dawg!";

            return message3;
        };

        System.out.println(speakable.speak("My message is: "));

        //6666666666666666666666666666666666666666666666666666




    }



}


//create an interface class:
interface Drawable{

    //From commented out 'Old way of instantiating a drawable obj':
    //public void draw(int width, int height); //no body as its an interface (made for implementation)

    public void draw(int width, int height);
}


interface  Addable{
   public int add(int a, int b); //method takes in int an and b, and returns an int (as not 'void')
}


interface Speakable{
    public String speak(String message);
}
