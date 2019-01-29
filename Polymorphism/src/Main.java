public class Main {

    public static void main(String[] args) {
       // System.out.println("Hello World!");


        Vet myVet = new Vet();

        Cat myCat = new Cat();
        Dog myDog = new Dog();

        myVet.giveShot(myCat);
        myVet.giveShot(myDog);


      /*  myDog.makeSound();
        myDog.makeSound("Woof, woof, baby!");
        myDog.makeSound("meeeow, daddyo", 6);
*/

//        myDog.makeSound("another woof");

    }
}
