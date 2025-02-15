package multithreading;


public class MonitorLock2 {
    public static void main(String[] args) {
        System.out.println("Main method started");
        SharedResource sharedResource = new SharedResource();

        Thread producerThread = new Thread(new ProducerClass(sharedResource));
        Thread consumerThread = new Thread(new ConsumerClass(sharedResource));

        producerThread.start();
        consumerThread.start();
    }
}

class SharedResource{
    boolean itemAvailable = false;

    // synchronized put the monitor lock
    public synchronized void addItem(){
        itemAvailable = true;
        System.out.println("Item added by : " + Thread.currentThread().getName() + " and invoking all other threads that are waiting");
        notifyAll();  // this will notify all other threads who are waiting on this object
    }

    public synchronized void consumeItem(){
        System.out.println("ConsumeItem() invoked by : " + Thread.currentThread().getName());

        while(!itemAvailable){
            try{
                System.out.println("Thread " + Thread.currentThread().getName() + " is waiting now");
                wait();  // this will release the monitor lock and let someone notify him that he can now put the lock back on
            }catch (Exception e){
                System.out.println(e);
            }
        }

        System.out.println("Out of waiting");
        System.out.println("Item consumed by : " + Thread.currentThread().getName());
        itemAvailable = false;
    }
}

class ProducerClass implements Runnable{
    SharedResource sharedResource;
    public ProducerClass(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }
    @Override
    public void run(){
        System.out.println("Producer thread : "+ Thread.currentThread().getName());
        try{
            Thread.sleep(10000);
        }
        catch (Exception e){
            System.out.println(e);
        }
        sharedResource.addItem();
    }
}
class ConsumerClass implements Runnable{
    SharedResource sharedResource;
    public ConsumerClass(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }
    @Override
    public void run(){
        System.out.println("Consumer thread : "+ Thread.currentThread().getName());
        sharedResource.consumeItem();
    }
}