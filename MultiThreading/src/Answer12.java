import java.util.concurrent.atomic.AtomicInteger;

public class Answer12 implements Runnable {
    AtomicInteger count = new AtomicInteger();
    
    void increment(){
        for (int i = 0; i <10 ; i++) {
            count.incrementAndGet();
        }
    }
    
    @Override
    public void run() {
        increment();
    }
    
    public static void main(String[] args)throws InterruptedException {
        Answer12 obj1 = new Answer12();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj1);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(obj1.count);
    }
}
