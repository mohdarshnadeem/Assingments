package Question1;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.*;
//
//class MyRunnable implements Runnable{
//    @Override
//    public void run(){
//        int random = (int)(Math.random()*100);
//        System.out.println("Doesn't return anything, only prints: "+ random);
//    }
//}
//
//class MyCallable implements Callable{
//    @Override
//    public Integer call(){
//        return (int)(Math.random()*100);
//    }
//}

public class CallableExample{
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(()-> System.out.println("Doesn't return anything only prints: "+(int)(Math.random()*100)));

        //MyRunnable myRunnable = new MyRunnable();
//        Thread thread = new Thread(()-> System.out.println("Doesn't return anything only prints: "+(int)(Math.random()*100)));
//        thread.start();

        Future<Integer> future = executorService.submit(()->  (int)(Math.random()*100));

        try {
            System.out.println("Return from callable: "+ future.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        executorService.shutdown();

    }



}
