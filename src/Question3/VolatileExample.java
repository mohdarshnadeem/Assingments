package Question3;

public class VolatileExample {

    private static volatile boolean flag = true;

    public static void main(String[] args) {
//      this will keep running till flag is true
        Thread thread = new Thread(()->{
            while (flag){
                System.out.println("Worker is running...");
                try {
                    Thread.sleep(300);//Simulate work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Worker has stopped...");
        });

        thread.start();
        try{
            Thread.sleep(3000);//allowing worker thread to run for 3 sec
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        flag = false;//stopping the worker thread
        System.out.println("Main requested a stop");

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main thread exiting...");
    }
}
