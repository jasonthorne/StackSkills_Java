
class Person {
    private String name;
    private String password;

    //getters & setters
    public String getPersonName() { return name; }
    public void setPersonName(String name) { this.name = name; }
    public String getPersonPassword() { return password; }
    public void setPersonPassword(String password) { this.password = password; }
}



//Generic class with template which accepts generic type 'T' (I.E. an object of any type)
//Angular brackets are used for generics instead of brackets
class Login<T>{
    private T name; //'T 'is a generic template object (I.E. can be of any type)
    private T password;

    //Login class constructor
    public Login(T name, T password){
        this.name = name;
        this.password = password;
    }

    //getters & setters
    public T getName() { return name; }
    public void setName(T name) { this.name = name; }
    public T getPassword() { return password; }
    public void setPassword(T password) { this.password = password; }
}

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");

        //Angular brackets are used for generics instead of brackets
        Login<String> login1 = new Login<String>("Paul", "password");
        Login<Integer> login2 = new Login<Integer>(5, 7); //another example of a login object


        System.out.println(login1.getName() + " " + login2.getName());

        //---------
        Person person = new Person();
        person.setPersonName("Bob");
        person.setPersonPassword("123");

        Login<Person> login3 = new Login<Person>(person, person);

        System.out.println(login3.getName().getPersonName());
        //-----------

    }
}
