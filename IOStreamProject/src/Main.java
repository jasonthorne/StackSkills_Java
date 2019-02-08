import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException { //this method throws an exception

        byte data[] = new byte[10];//data array of type byte

        /*System.out.println("Enter some characters: ");

        System.in.read(data); //read input from console and save in data array
        System.out.println("You entered: ");

        for (int i = 0; i < data.length; i++) {
            System.out.print((char)data[i]); //casting data stream of bytes to chars so they're readable
        }
        */

        //++++reading text file:+++

        File file = new File("src/test.txt");

        //surrounding in try-catch incase of fail
        try (FileInputStream fileInputStream = new FileInputStream(file)){

            System.out.println("total size to read in bytes: " + fileInputStream.available());

            int content;

            //'fileInputStream.read' returns bytes left to read in file (0 being when its reached the last byte)
            while ((content = fileInputStream.read()) != -1){  //while there's still more bytes left to read.

                //convert bytes held in 'content' to chars and display
                System.out.print((char) content);
            }

        }catch (IOException e){ //specific IO exception methods being used to help with debugging (declared in Main)

            e.printStackTrace(); //detailed error log relating to IO exceptions will be printed.
        }


    }
}
