import java.io.*;

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

        //+++++BUFFER READER METHOD OF READING:

        try (FileReader fileReader = new FileReader(file)){

            //Buffered reader is better for reading, but requires a filereader being passed to it
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null; //for holding what is read.

            while ((line = bufferedReader.readLine()) != null){ //if line is not null (ie there is content in .readLine)

                System.out.println(line); //No conversion necessary like with fileInputStream below, as BufferedReader reads as string

            }

        }catch (IOException e){

            e.printStackTrace();

        }

        /*
        //+++FILEINPUTSTREAM METHOD OF READING:
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
        */




    }
}
