package Question1;

public class ThreadExample extends Thread{
    @Override
    public void run(){
        try {
            Thread.sleep(5000);//sleep the current thread for 5 sec
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName());
    }
}
