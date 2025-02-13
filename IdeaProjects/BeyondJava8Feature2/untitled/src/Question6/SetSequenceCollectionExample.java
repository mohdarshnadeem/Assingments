package Question6;

import java.util.LinkedHashSet;
import java.util.Set;


//Demonstrate the use of addFirst(), addLast, removeFirst(), removeLast, getFirst(),
//getLast(), reversed() in Set and List Sequenced collections
public class SetSequenceCollectionExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Ramesh");
        set.add("Himesh");
        set.addFirst("Arsh");
        set.addLast("Madhav");
        System.out.println(set);

        System.out.println(set.getFirst());
        System.out.println(set.getLast());
        System.out.println(set.reversed());
        System.out.println(set.removeFirst());
        System.out.println(set.removeLast());
        System.out.println(set);

    }
}
