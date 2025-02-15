package multithreading.customLocks;

import java.util.concurrent.locks.StampedLock;

/*
- used to implement the optimistic concurrency handling (just the version maintaining thing)
- lock.tryOptimisticRead() : will give a version (stamp)
 */
public class StampedLockDemo {
    public static void main(String[] args) {
        SharedResourceSL resourceSL = new SharedResourceSL();

        Thread t1 = new Thread(() -> resourceSL.producer());
        Thread t2 = new Thread(() -> resourceSL.consumer());

        t1.start();
        t2.start();
    }
}
class SharedResourceSL{
    int a = 10;
    StampedLock lock = new StampedLock();
    public void producer(){
        long stamp = lock.tryOptimisticRead();
        try{
            System.out.println("Taken optimistic read lock by : " + Thread.currentThread().getName());
            a++;
            Thread.sleep(8000);
            if(lock.validate(stamp)){
                System.out.println("updated the value successfully. values of a : " + a);
            }
            else{
                System.out.println("Rolling back changes");
                a--;
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public void consumer(){
        long stamp = lock.writeLock();
        try{
            System.out.println("Write lock acquired by : " + Thread.currentThread().getName());
            a = 9;
        }
        finally {
            lock.unlock(stamp);
            System.out.println("write lock released by : " + Thread.currentThread().getName());
        }
    }
}
