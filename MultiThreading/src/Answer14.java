public class Answer14 {
    
    void task1(){
        synchronized (this){
            System.out.println("Extractng file 1");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    
            System.out.println("Successfully extracted file 1");
        }
    }
    
    void task2(){
        synchronized (this){
            System.out.println("Extractng file 2");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        
            System.out.println("Successfully extracted file 2");
        }
    }
    
    void task3(){
        synchronized (this){
            System.out.println("Extracting file 3");
            System.out.println("Successfully extracted file 3");
            notifyAll();
        }
    }
    public static void main(String[] args) {
        Answer14 obj = new Answer14();
        new Thread(new Runnable() {
            @Override
            public void run() {
                obj.task1();
            }
        }).start();
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                obj.task2();
            }
        }).start();
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                obj.task3();
            }
        }).start();
    }
}
