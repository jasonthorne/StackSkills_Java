public class Main {

    public static void main(String[] args) {
        System.out.println("Main thread starting!");

        //create new object from myThread:
        MyThread myThreadClassObj = new MyThread("Child #1");

        //Construct an actual thread from the 'myThreadClassObj' obj above:
        Thread newThread = new Thread(myThreadClassObj);

        //start the thread
        newThread.start();


    }
}


class MyThread implements Runnable{ //ALL threads need to implement from Runnable ++++

    String myThread;

    @Override
    public void run() { //This is where you write the code that will run inside the thread ++++

        System.out.println(myThread + " Starting");

        for (int count = 0; count < 10; count++) {

            try { //Thread creation/invocation MUST be surrounded by try-catches +++++

                Thread.sleep(400); //make a thread sleep for 400 millisecs
                System.out.println("In " + myThread + " count is: " + count); //sOnt after 400ms wait

            }catch (InterruptedException e){

                System.out.println(myThread + " was interrupted");
                e.printStackTrace();
            }System.out.println(myThread + " terminated");

            
        }
    }

    //constructor:
    public MyThread(String myThread) {

        this.myThread = myThread;
    }
}