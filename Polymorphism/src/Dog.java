public class Dog extends Animal{

    private String name;

    public void move() {
        System.out.println("Move");
    }


    @Override
    public void makeSound() {
        System.out.println("woof!");
    }

    @Override
    public void makeSound(String soundType) {
        System.out.println("From dog class: " + soundType);
    }
}
