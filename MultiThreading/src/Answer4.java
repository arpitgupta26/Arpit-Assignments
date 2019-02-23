import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Answer4 {
    
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try{
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Task1 done by " + Thread.currentThread().getName());
                }
            });
        
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Task2 done by " + Thread.currentThread().getName());
                }
            });
        
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Task3 done by " + Thread.currentThread().getName());
                }
            });
    
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Task4 done by " + Thread.currentThread().getName());
                }
            });
        }
        finally {
            executorService.shutdownNow();
        }
    }
}
