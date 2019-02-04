public class Main {

    public static void main(String[] args) {

        //System.out.println("Hello World!");
        int myVal = -45;
        int myVal2 = 56;

       //System.out.println(Math.abs(myVal));

        //System.out.println(Math.min(myVal, myVal2));

        int x = Math.min(myVal, myVal2);
        int y = Math.abs(myVal);

        System.out.println("x " + x + " y " + y);

        //Class methods should be static if instant variables arent required within the methods of those classes

    }
}
