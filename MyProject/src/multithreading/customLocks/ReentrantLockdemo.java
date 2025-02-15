package multithreading.customLocks;

import java.util.concurrent.locks.ReentrantLock;

/*
- Here the lock works as a mobile entity. One lock is used when we want to lock code lines of different objects.
- if a lock has been made between some particular code lines.. all the rest of the code lines falling between other locks
    unlocks() would also be inaccessible (just like synchronized blocks)
- If different lock is used by different resources, we won't be able to make use of the locks to block the code lines
for different objects
 */
public class ReentrantLockdemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        SharedResource sharedResource1 = new SharedResource();
        Thread t1 = new Thread(() -> sharedResource1.producer(lock));

//        ReentrantLock lock2 = new ReentrantLock();

        SharedResource sharedResource2 = new SharedResource();
//        Thread t2 = new Thread(() -> sharedResource2.producer(lock));
        Thread t2 = new Thread(() -> sharedResource2.consumer(lock));


        t1.start();
        t2.start();
    }
}

class SharedResource{
    boolean isAvailable = false;



    public void producer(ReentrantLock lock){
        try{
            lock.lock();
            System.out.println("Lock acquired at producer by: " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(3000);
        }catch (Exception e){
            System.out.println(e);
        }
        finally{
            lock.unlock();
            System.out.println("Lock released at producer by : " + Thread.currentThread().getName());
        }
    }

    public void consumer(ReentrantLock lock){
        try{
            lock.lock();
            System.out.println("Lock acquired at consumer by: " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(3000);
        }catch (Exception e){
            System.out.println(e);
        }
        finally{
            lock.unlock();
            System.out.println("Lock released at consumer by : " + Thread.currentThread().getName());
        }
    }
}