package Question1;

public class Main {
    public static void main(String[] args) {

        ThreadExample thread = new ThreadExample();
        thread.setName("From Thread class");

        RunnableExample runnableExample = new RunnableExample();
        Thread runnable = new Thread(runnableExample);
        runnable.setName("From Runnable interface");
        thread.start();
        runnable.start();

        try {
            Thread.sleep(1000);//sleeps the main thread for 1 sec
            thread.join();
            runnable.join();//this makes sure that no other thread is executed until the
            // running finish its execution runnable
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("From main");
    }
}
