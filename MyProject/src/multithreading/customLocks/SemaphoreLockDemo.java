package multithreading.customLocks;

import java.util.concurrent.Semaphore;

public class SemaphoreLockDemo {
    public static void main(String[] args) {
        ShareResourceSema shareResourceSema = new ShareResourceSema();
        Thread t1 = new Thread(() -> shareResourceSema.producer());
        Thread t2 = new Thread(() -> shareResourceSema.producer());
        Thread t3 = new Thread(() -> shareResourceSema.producer());
        Thread t4 = new Thread(() -> shareResourceSema.producer());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class ShareResourceSema{
    boolean isAvailable = false;
    Semaphore lock = new Semaphore(2);
    public void producer(){
        try{
            lock.acquire();
            System.out.println("Lock acquired by : " + Thread.currentThread().getName());
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            lock.release();
            System.out.println("Lock released by : " + Thread.currentThread().getName());
        }
    }
}
