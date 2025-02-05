package Question1;

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        List<Float> list = new ArrayList<>();
        list.add(1.2f);
        list.add(2.2f);
        list.add(3.2f);
        list.add(1.6f);
        list.add(8.9f);
        Float sum =0f;

        Iterator<Float> itr = list.iterator();
        while(itr.hasNext()){
            sum += itr.next();
        }
        System.out.println("Sum is: " +sum);

    }
}
