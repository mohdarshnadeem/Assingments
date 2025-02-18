package Question4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

            Future<Integer> future = executorService.submit(() -> (int) (Math.random() * 100));
            try {
                System.out.println(future.get());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            executorService.shutdown();

    }
}
