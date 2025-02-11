package Question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,43,6,7,1,2,4,8,3);

        int sum = list.stream().filter(a -> a>5).mapToInt(a->a).sum();
        System.out.println(sum);

    }
}
