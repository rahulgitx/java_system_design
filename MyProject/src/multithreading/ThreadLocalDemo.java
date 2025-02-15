package multithreading;

public class ThreadLocalDemo {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();

        threadLocal.set(Thread.currentThread().getName());


        Thread t1 = new Thread(() -> {
            threadLocal.set(Thread.currentThread().getName());
            System.out.println("thread: " + Thread.currentThread().getName() + " " + threadLocal.get());
        });

        t1.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("thread: " + Thread.currentThread().getName() + " " + threadLocal.get());
    }
}
