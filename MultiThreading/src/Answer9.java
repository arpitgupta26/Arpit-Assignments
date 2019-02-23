import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Answer9 {
    
    public static void main(String[] args){
        ExecutorService executorService = Executors.newCachedThreadPool();
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
    
        for (int i = 0; i <40 ; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Tasks Running...");
                }
            });
        }
        executorService.shutdown();
    }
}
