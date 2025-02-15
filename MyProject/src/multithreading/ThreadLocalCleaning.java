package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadLocalCleaning {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();

        ExecutorService threadPoolExecutor = Executors.newFixedThreadPool(5);

        threadPoolExecutor.submit(() -> {
           threadLocal.set(Thread.currentThread().getName());

           // remove
//            threadLocal.remove();
        });

        for(int i=0; i<15; i++){
            threadPoolExecutor.submit(() -> {
                System.out.println(threadLocal.get());
            });
        }

        threadPoolExecutor.shutdown();
    }
}
