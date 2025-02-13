package Question3;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.Map.entry;

public class ImmutableCollctionExample {
    public static void main(String[] args) {

        List<String> list = List.of("Arsh","Anurag","Rohit");
        list.forEach(System.out::println);

        Map<Integer, String> map = Map.of(1,"Arsh",
                2,"Anurag",
                3,"Rohit");

        //for more than 10 values
        Map<String, Integer> map2 = Map.ofEntries(
                entry("Nadeem TTN",4),
                entry("TTN ",5),
                entry("Gupta TTN",6)
        );

//        for(Map.Entry<String, Integer> entry : map2.entrySet()){
//            System.out.println(entry.getKey()+ "->" +entry.getValue());
//        }

            map2.forEach((k,v) -> System.out.println(k+" -> "+v));

        Set<Integer> set = Set.of(1,2,3,4,5);
        set.forEach(System.out::println);


    }
}
