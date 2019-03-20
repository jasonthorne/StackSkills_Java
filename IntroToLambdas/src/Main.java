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
        
        Addable addable = (a,b)->(a+b); //passing a & b as params, declaring its method operation to be a + b
        //invoke addable method:
        System.out.println(addable.add(1, 3));


        //Can also SPECIFY what input type to pass as params ('int a'):
        Addable addable2 = (int a, int b)->(a+b); //passing a & b as params, declaring its method operation to be a + b
        //invoke addable method:
        System.out.println(addable2.add(5, 3));

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
