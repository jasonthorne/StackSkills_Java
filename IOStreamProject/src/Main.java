import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException { //this method throws an exception

        byte data[] = new byte[10];//data array of type byte

        System.out.println("Enter some characters: ");
        System.in.read(data); //read input from console and save in data array
        System.out.println("You entered: ");

        for (int i = 0; i < data.length; i++) {
            System.out.print((char)data[i]); //casting data stream of bytes to chars so they're readable
        }


    }
}
