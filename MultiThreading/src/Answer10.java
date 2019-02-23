public class Answer10 implements Runnable{
    
    @Override
    public void run() {
        display();
    }
    
    synchronized void display(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Running");
        }
    }
    public static void main(String[] args) {
        Answer10 obj1 = new Answer10();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj1);
        t1.start();
        t2.start();
    }
}
