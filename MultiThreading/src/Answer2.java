public class Answer2 implements Runnable {
    
    String name;
    
    public Answer2(String name){
        
        this.name = name;
    }
    
    @Override
    public void run() {
        for (int i = 0; i <3 ; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(name + " running.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
    
    public static void main(String[] args)throws InterruptedException {
        Answer2 obj1 = new Answer2("Obj1");
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj1);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Main Thread");
    
    }
}
