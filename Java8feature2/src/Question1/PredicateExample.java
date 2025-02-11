package Question1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
//        predicate basically is used to check the condition
        Predicate<Integer> predicate = (a) -> a%2 == 0;
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        //finding even
        List<Integer> even = list.stream().filter(predicate).toList();
        System.out.println(even);
    }
}
