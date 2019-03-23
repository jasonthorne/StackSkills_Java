public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}


class MyThread implements Runnable{ //ALL threads need to implement from Runnable ++++

    String myThread;

    @Override
    public void run() { //This is where you write the code that will run inside the thread ++++

        System.out.println(myThread + " Starting");

        for (int count = 0; count < 10; count++) {

            try { //Thread creation/invocation MUST be surrounded by try-catches +++++

                Thread.sleep(400); //start a thread and make it sleep for 400 millisecs
                System.out.println("In " + myThread + "count is: " + count); //sOunt after 400ms wait

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