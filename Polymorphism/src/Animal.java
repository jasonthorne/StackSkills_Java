public class Animal {
    private String name;

    //Overloading methods

    public void makeSound(){
        System.out.println("grrrr!");
    }

    public void makeSound(String soundType){
        System.out.println(soundType);
    }

    public void makeSound(String soundType, int soundLevel){
        System.out.println(soundType + " " + soundLevel);
    }
}
