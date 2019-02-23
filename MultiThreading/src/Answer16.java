import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Answer16 {
    private Lock lock1 = new ReentrantLock(true);
    private Lock lock2 = new ReentrantLock(true);
    
    public void task1(){
        acquireLocks(lock1,lock2);
        //lock1.lock();
        System.out.println("Lock 1 acquired for task 1");
        //lock2.lock();
        System.out.println("Lock 2 acquired for task 1");
        lock2.unlock();
        lock1.unlock();
        System.out.println("All locks released from task 1");
    }
    
    public void task2(){
        acquireLocks(lock1,lock2);
        //lock2.lock();
        System.out.println("Lock 2 acquired for task 2");
        //lock1.lock();
        System.out.println("Lock 1 acquired for task 2");
        lock2.unlock();
        lock1.unlock();
        System.out.println("All locks released from task 2");
    }
    void acquireLocks(Lock lock1, Lock lock2){
        if(lock1.tryLock() && lock2.tryLock()){
            return;
        }
        else {
            if(lock1.tryLock()){
                lock1.unlock();
            }
            else if(lock2.tryLock()){
                lock2.unlock();
            }
        }
    }
    
    
    public static void main(String[] args)throws InterruptedException {
        Answer16 obj = new Answer16();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.task1();
            }
        });
        
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.task2();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
