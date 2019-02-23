import java.util.concurrent.*;

public class Answer6 {
    
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Arpit";
            }
        };*/
    
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> stringFuture = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Arpit";
            }
        });
        executorService.shutdown();
        if(stringFuture.isDone()){
            System.out.println(stringFuture.get());
        }
        
        if(stringFuture.isCancelled()){
            System.out.println("Task Cancelled");
        }
    }
}
