package Question5;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class OrderSystem {
    public static void main(String[] args) {
        System.out.println("Restaurant closing Normally: shutdown()");
        restaurantShutdown();

        System.out.println("**************************");

        System.out.println("Restaurant closing in emergency: ShutdownNow()");
        restaurantShutdownNow();
    }

    public static void restaurantShutdown() {
        ExecutorService service = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            final int orderId = i;
            service.submit(() -> {
                System.out.println("Preparing order for: " + orderId);
                try {
                    Thread.sleep(3000);//simulating preparing time
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println();
                System.out.println("Order prepared for : " + orderId);
            });
        }
        service.shutdown();
        try {
            if (!service.awaitTermination(5, TimeUnit.SECONDS)) {
                System.out.println("Some order were not completed on time");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Restaurant is now closed");
    }
    public static void restaurantShutdownNow() {
        ExecutorService service = Executors.newFixedThreadPool(3);

        // Submit tasks for orders
        for (int i = 1; i <= 5; i++) {
            final int orderId = i;
            service.submit(() -> {
                System.out.println("Preparing order for: " + orderId);
                try {
                    Thread.sleep(1000); // Simulating order preparation
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Prepared order for: " + orderId);
            });
        }

        // Simulating some time before shutdown
        try {
            Thread.sleep(10); // Giving some time for orders to be processed
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Shutdown now (emergency stop)
        List<Runnable> pendingOrders = service.shutdownNow();
        System.out.println("Emergency shutdown! Pending orders: " + pendingOrders.size());

        // Await termination for tasks to finish
        try {
            service.awaitTermination(1, TimeUnit.SECONDS);  // Wait for tasks to finish
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Restaurant closed due to emergency!");
    }

}
