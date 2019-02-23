public class Answer13 {
    private int a;
    
    void increment(){
        synchronized (this){
            for (int i = 0; i <10 ; i++) {
                a++;
                System.out.println(a);
                if(i==4){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        
    }
    
    void decrement(){
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                a--;
                System.out.println(a);
            }
            notify();
        }
    }
    
    public static void main(String[] args){
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
