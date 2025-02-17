package Question4;

public class DeadlockExample {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Runnable thread1 = new Thread(()-> pen.writeWithPenAndPaper(paper), "Thread1");
        Runnable thread2 = new Thread(()-> {
             {
                paper.writeWithPaperAndPen(pen);
            }},"Thread2");

//        synchronized (pen) {//resolution:Uses a lambda with a synchronized block on the pen before calling paper.
//        writeWithPaperAndPen(pen), which then tries to lock the pen again inside the method.
//            paper.writeWithPaperAndPen(pen);
//        }},"Thread2");

        thread1.start();
        thread2.start();

    }
}
