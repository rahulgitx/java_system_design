package multithreading.customLocks;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/*
- used to implement shared lock and exclusive locks
- works in similar manner as reentrant lock (can be used for different objects to lock particular code sections)
- shared lock - lock.readLock().lock(); // multiple such locks can be made but we should not do any write operation
  to maintain the principles of shared lock
- exclusive lock - lock.writeLock.lock(); // only one lock can be made
 */
public class ReadWriteLockDemo {
    public static void main(String[] args) {
        ReadWriteLock lock = new ReentrantReadWriteLock();

        SharedResourceRWL resourceRWL1 = new SharedResourceRWL();
        Thread t1 = new Thread(() -> resourceRWL1.producer(lock));

        SharedResourceRWL resourceRWL2 = new SharedResourceRWL();
        Thread t2 = new Thread(() -> resourceRWL2.producer(lock));

        SharedResourceRWL resourceRWL3 = new SharedResourceRWL();
        Thread t3 = new Thread(() -> resourceRWL3.consumer(lock));

        t1.start();
        t2.start();
        t3.start();
    }
}

class SharedResourceRWL{
    boolean isAvailable = false;
    public void producer(ReadWriteLock lock){
        try{
            lock.readLock().lock();
            System.out.println("Read lock applied by thread : " + Thread.currentThread().getName());
            Thread.sleep(10000);
        }catch (Exception e){
            System.out.println(e);
        }
        finally{
            lock.readLock().unlock();
            System.out.println("Read lock released by thread : " + Thread.currentThread().getName());
        }
    }

    public void consumer(ReadWriteLock lock){
        try{
            lock.writeLock().lock();
            System.out.println("Write lock applied by thread : " + Thread.currentThread().getName());
            isAvailable = true;
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            lock.writeLock().unlock();
            System.out.println("Write lock released by thread : " + Thread.currentThread().getName());
        }
    }

}