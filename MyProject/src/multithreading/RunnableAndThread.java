package multithreading;

public class RunnableAndThread {
    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread object
                    = new Thread(new MultithreadingDemo2());
            object.start();
        }

        for (int i = 0; i < n; i++) {
            MultithreadingDemo1 object
                    = new MultithreadingDemo1();
            object.start();
        }
    }
}
class MultithreadingDemo1 extends Thread {
    public void run(){
        try {
            // Displaying the thread that is running
            System.out.println(
                    "Thread " + Thread.currentThread().getId()
                            + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

class MultithreadingDemo2 implements Runnable {
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println(
                    "Thread " + Thread.currentThread().getId()
                            + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
