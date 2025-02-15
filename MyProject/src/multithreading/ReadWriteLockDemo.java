package multithreading;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockDemo {
    public static void main(String[] args) {
        SharedResourceRWL resourceRWL1 = new SharedResourceRWL();
        ReadWriteLock lock = new ReentrantReadWriteLock();

        Thread t1 = new Thread(() -> {resourceRWL1.producer(lock);});
        Thread t2 = new Thread(()-> resourceRWL1.consumer(lock));

        SharedResourceRWL resourceRWL2 = new SharedResourceRWL();

        Thread t3 = new Thread(() -> resourceRWL2.consumer(lock));

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
            System.out.println("Read lock acquired by : " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(8000);
        }
        catch (Exception e){

        }
        finally{
            lock.readLock().unlock();
            System.out.println("Read lock released by : " + Thread.currentThread().getName());
        }
    }

    public void consumer(ReadWriteLock lock){
        try{
            lock.writeLock().lock();
            System.out.println("Write lock acquired by: " + Thread.currentThread().getName());
            isAvailable = false;
            Thread.sleep(3000);
        }
        catch (Exception e){

        }
        finally {
            lock.writeLock().unlock();
            System.out.println("Write lock released by: " + Thread.currentThread().getName());
        }
    }
}
