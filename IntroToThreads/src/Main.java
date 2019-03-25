public class Main {

    public static void main(String[] args) {
        System.out.println("Main thread starting!");

        //create a new thread by creating an instance of 'MyThread' class
        MyThread mythread = new MyThread("Child #1");

    }
}


class MyThread implements Runnable{ //ALL threads need to implement from Runnable ++++

    Thread thread; //thread variable of type 'Thread'

    String threadName; //for holding name of thread

    @Override
    public void run() { //This is where you write the code that will run inside the thread ++++

        System.out.println(threadName + " Starting");

        for (int count = 0; count < 10; count++) {

            try { //Thread creation/invocation MUST be surrounded by try-catches +++++

                Thread.sleep(400); //make a thread sleep for 400 millisecs
                System.out.println("In " + threadName + " count is: " + count); //sOnt after 400ms wait

            }catch (InterruptedException e){

                System.out.println(threadName + " was interrupted");
                e.printStackTrace();
            }System.out.println(threadName + " terminated");

            
        }
    }

    //constructor:
    public MyThread(String threadName) {

        //set the thread name:
        this.threadName = threadName;

        thread = new Thread(this, threadName); //This classe's 'thread' var becomes a new Thread Object, containing an instance of this class object, and a 'threadName' string.
        thread.start(); //start thread


    }
}