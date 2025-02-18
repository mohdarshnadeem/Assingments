package Question3;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

//SingleThreadExecutor processes tasks one by one.
//CachedThreadPool creates a new thread for each task if needed.
//FixedThreadPool runs 3 tasks in parallel (others wait in a queue).
public class ThreadPoolExample {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Arsh", "Rohit", "Abhinav", "Anurag","Arpit");

        executeTasks(Executors.newSingleThreadExecutor(),list, "singleThreadPool");
        executeTasks(Executors.newFixedThreadPool(3), list, "FixedThreadPool");
        executeTasks(Executors.newCachedThreadPool(),list, "cachedPool");
    }

    public static void executeTasks(ExecutorService service, List<String> names, String typePool){
        System.out.println("Polltype: "+ typePool);

        List<Future<String>> futures = names.stream()
            .map(name-> service.submit(()->{
            System.out.println(Thread.currentThread().getName()+ " is processing: ");
            Thread.sleep(3000);
            return "Processed: "+name;
        })).toList();

        futures.forEach( future ->
                {
                    try {
                        System.out.println(future.get());
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
        );
        System.out.println();
        service.shutdown();

        try {
            service.awaitTermination(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
