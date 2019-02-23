import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Answer3 {
    
    public static void main(String[] args) throws InterruptedException {
    
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
        }
        finally {
            executorService.shutdown();
        }
    
        if(!executorService.isTerminated()){
            Thread.sleep(1000);
        }
        if(executorService.isTerminated()){
            System.out.println("All tasks done");
        }
    }
}
