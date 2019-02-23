import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Answer8 {
    
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task 1 running");
                System.out.println("Task 1 finished");
            }
        },0, TimeUnit.SECONDS);
        
        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task 2 Running");
            }
        },2,1,TimeUnit.SECONDS);
        
        executorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task 3 Running");
            }
        },5,1,TimeUnit.SECONDS);

    }
}
