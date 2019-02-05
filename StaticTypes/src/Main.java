public class Main {

    private static String name;

    public static void main(String[] args) {

        name = "Dawg!";
        Abc.show(); //no object of class needed to invoke method as method is static
        System.out.println(name);
        System.out.println(Abc.i); //no object of class needed to see var as var is static

    }

}

class Abc
{
    static int i=5;

    public static void show(){
        System.out.println("Yo");
        //System.out.println(i);
    }

}
