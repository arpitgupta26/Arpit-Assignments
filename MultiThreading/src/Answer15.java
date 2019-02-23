import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Answer15 {
    private int a;
    private Lock lock1 = new ReentrantLock(true);
    
    void increment() {
        lock1.lock();
        for (int i = 0; i < 10; i++) {
            a++;
            System.out.println(a);
            if (i == 4) {
                try {
                    lock1.unlock();
                    wait();
                    lock1.lock();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        lock1.unlock();
    }
    
    void decrement() {
        lock1.lock();
            for (int i = 0; i < 5; i++) {
                a--;
                System.out.println(a);
            }
            lock1.unlock();
            notify();
            
    }
    
    public static void main(String[] args) {
        Answer13 obj = new Answer13();
        new Thread(new Runnable() {
            @Override
            public void run() {
                obj.increment();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                obj.decrement();
            }
        }).start();
    }
}
