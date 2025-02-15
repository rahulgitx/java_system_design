package multithreading;

/*
- for one object, only one thread can make a lock
- when one thread is using a synchronized block/method, all the rest of the synchronized blocks woule be inaccessible, rest
of the blocks would be accessible
- even if the synchronized blocks are in different methods, for an object only one can be used at a time.
 */
public class MonitorLock1 {
    public static void main(String[] args) {
        MonitorLockExample obj = new MonitorLockExample();
        Thread t1 = new Thread(() -> obj.task1());
        Thread t2 = new Thread(() -> obj.task2());
        Thread t3 = new Thread(() -> obj.task3());

        t1.start();
        t2.start();
        t3.start();

//        t1.run();
    }
}

class MonitorLockExample{
    public synchronized void task1(){
        try{
            System.out.println("inside task1");
            Thread.sleep(10000);
        }catch(Exception e){
            System.out.println("Exception occured " + e.toString());
        }
    }

    public void task2(){
        System.out.println("inside task2 before synchronized block");
        synchronized(this){
            System.out.println("inside task2, inside synchronized");
        }
    }

    public void task3(){
        System.out.println("inside task3");
    }
}
