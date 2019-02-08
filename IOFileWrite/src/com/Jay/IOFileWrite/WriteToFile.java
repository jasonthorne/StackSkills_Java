package com.Jay.IOFileWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class WriteToFile {

    public static void main(String[] args) {

        File file = new File("src/myFile.txt");

        //create new FileWriter object and pass it our file as file to write to
        try(FileWriter fileWriter = new FileWriter(file)) {

            fileWriter.write("What is this sorcery?!!!"); //write to file

            fileWriter.close(); //++++++IMPORTANT ++++++  close fileWriter after writing!!

            //+++++++++++++++++Read file contents back:

            FileInputStream fileInputStream = new FileInputStream(file);

            System.out.println("Total size to read in bytes: " + fileInputStream.available());
            int content;

            while ((content = fileInputStream.read()) != -1){

                System.out.print((char) content);

            }


        } catch (Exception e){

        }



    }
}
