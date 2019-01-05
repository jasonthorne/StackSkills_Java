public class Main
{
    public static void main (String args[]){

        ProcessHandle currProcess = ProcessHandle.current();
        ProcessHandle.Info currProcessInfo = currProcess.info(); //interface for getting process info
        System.out.println("PID: " + currProcess.pid());

        System.out.println("Info: " + currProcessInfo); //all info for process

    }
}
