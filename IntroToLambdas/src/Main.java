public class Main {

    public static void main(String[] args) {

        //Regular way of instantiating a drawable obj:
        Drawable drawable1 = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing...");
            }

        };//this colon needed adding!! +++++


        //invoke drawable method:
        drawable1.draw();


        //Lambda way:
        Drawable drawable2 = () ->{
            System.out.println("Lambda Drawing...");

        };

        //invoke Lambda drawable method:
        drawable2.draw();

    }



}


//create an interface class:
interface Drawable{

    public void draw(); //no body as its an interface (made for implementation)


}
