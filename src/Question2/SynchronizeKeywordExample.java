package Question2;

public class SynchronizeKeywordExample {
    private int count;
    public synchronized void increment(){//synchronized keyword
        count++;
    }

    public  int getCount(){
        return count;
    }
}
