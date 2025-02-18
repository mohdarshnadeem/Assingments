package Question2;

import java.util.concurrent.locks.ReentrantLock;

public class HandlingDeadLock {
    public static void main(String[] args) {

        Paper paper= new Paper();
        Pen pen = new Pen();

        Thread t1 = new Thread(()-> pen.writeWithPenAndPaper(paper),"User1");
        Thread t2 = new Thread(()-> paper.writeWithPaperAndPen(pen),"User2");

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            System.out.println("Interrupt occur");
         }
    }
}

class Pen {
    private static ReentrantLock lock = new ReentrantLock();

    public void writeWithPenAndPaper(Paper paper) {
        if (lock.tryLock()) {
            try {
                System.out.println(Thread.currentThread().getName() + " is using Pen and trying to use Paper");
                paper.finishWriting();
            }finally {
                lock.unlock();
            }
        }else{
            System.out.println(Thread.currentThread().getName()+" can't acquire lock on pen");
        }
    }

    public void finishWriting(){
        System.out.println("Finish writing with Pen");
    }
}

class Paper {
    private static ReentrantLock lock = new ReentrantLock();

    public void writeWithPaperAndPen(Pen pen){
        if (lock.tryLock()){
            try{
                System.out.println(Thread.currentThread().getName()+" is using Paper and trying to use Pen ");
                pen.finishWriting();
            }finally {
                lock.unlock();
            }
        }else{
            System.out.println(Thread.currentThread().getName()+" can't acquire lock on paper");
        }
    }

    public void finishWriting(){
        System.out.println("Finish writing on paper");
    }

}
