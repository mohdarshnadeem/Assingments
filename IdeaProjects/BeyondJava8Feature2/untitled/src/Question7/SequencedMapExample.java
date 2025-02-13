package Question7;

import java.util.LinkedHashMap;

//Demonstrate the use of firstEntry(), lastEntry(), pollFirstEntry(), pollLastEntry(),
//putFirst(), putLast(), reversed() with SequencedMap.
public class SequencedMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String > map = new LinkedHashMap<>();
        map.put(101, "Arsh");
        map.put(102,"Akshat");
        map.put(103,"Zaid");
        map.put(104,"Ankur");
        map.put(105,"Nitin");

        map.forEach((k,v) -> System.out.println(k+" -> "+v));

        map.putFirst(100,"Vivek");
        map.putLast(106, "Arpit");

        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());
        System.out.println(map);
        System.out.println(map.reversed());
        System.out.println(map.pollFirstEntry());
        System.out.println(map.pollLastEntry());
        System.out.println(map);
    }

}
