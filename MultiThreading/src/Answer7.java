import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Answer7 {
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        List<Callable<String>> list = new ArrayList<>();
        list.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Task1";
            }
        });
        list.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Task2";
            }
        });
        list.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "task3";
            }
        });
        
        List<Future<String>> futureList = executorService.invokeAll(list);
        executorService.shutdown();
        for (Future i: futureList) {
            if(i.isDone()){
                System.out.println(i.get());
            }
            if(i.isCancelled()){
                System.out.println("Task cancelled");
            }
        }
        System.out.println("Finished");
    }
}
