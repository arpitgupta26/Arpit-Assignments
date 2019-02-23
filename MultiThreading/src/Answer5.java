import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Answer5 {
    
    public static void main(String[] args)throws InterruptedException {
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
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Task5 done by " + Thread.currentThread().getName());
                }
            });
        }
        finally {
            executorService.shutdown();
        }
        executorService.awaitTermination(2, TimeUnit.SECONDS);
        System.out.println(executorService.isShutdown());
        System.out.println(executorService.isTerminated());
    }
}
