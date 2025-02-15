package multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecuter {
    public static void main(String[] args) {
        ThreadPoolExecutor myExec = new ThreadPoolExecutor(2, 5, 1, TimeUnit.HOURS,
                new ArrayBlockingQueue<>(10), new CustomRejectionHandler());
        myExec.allowCoreThreadTimeOut(true);

        // submit threads
        for(int i=0;i<25; i++){
            myExec.submit(() -> {
                try{
                    System.out.println("Thread started : " + Thread.currentThread().getName() );
                    Thread.sleep(8000);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            });
        }

        myExec.shutdown();
    }
}

class CustomRejectionHandler implements RejectedExecutionHandler{

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task denied for " + r.toString());
    }
}
