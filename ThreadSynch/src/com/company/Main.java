package com.company;

public class Main {

    public static void main(String[] args) {

        //instantiate 'first' object:
        First first = new First();

        //create 'second' obj (which is our thread), passing in our 'first' obj (which displays our message).
        Second one = new Second(first, "welcome");

        //repeat as above twice, with new messages:
        Second two = new Second(first, "new");
        Second three = new Second(first, "programmer");

    }
}

class First{

    //'display' method thats passed a msg
    void display(String msg){
        System.out.println(" ["+msg);

        try {
            Thread.sleep(1000); //sleep for a second

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("] "); //once everythings terminated, close bracket

    }
}


class Second extends Thread { //extends thread inorder to use run method here

    String msg;
    First fObj; //an object of first class, declared as an instance variable

    //constructor:
    Second (First fp, String str){
        fObj = fp;
        msg = str;
        start(); //call start on thread
    }

    //override run method
    public void run(){
        fObj.display(msg); //call the objects display method, passing in message.
    }



}
