public class Answer11 extends Thread {
    
    @Override
    public void run() {
        synchronized (this){
            for (int i = 0; i <10 ; i++) {
                System.out.println(Thread.currentThread().getName() + " Running");
            }
        }
    }
    
    public static void main(String[] args)throws InterruptedException {
        Answer11 obj1 = new Answer11();
        Answer11 obj2 = new Answer11();
        obj1.start();
        obj2.start();
    }
    
}
