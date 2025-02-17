package Question2;

public class Main {
    public static void main(String[] args) {
        SynchronizeKeywordExample obj = new SynchronizeKeywordExample();

        Thread thread1 = new Thread(()->{
            for (int i = 0; i < 5000; i++) {
                obj.increment();
            }
        });
        thread1.setName("thread1");

        Thread thread2 = new Thread(()->{
            for (int i = 0; i < 5000; i++) {
                obj.increment();
            }
        }
        );
        thread2.setName("thread2");
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println(obj.getCount());

    }
}
