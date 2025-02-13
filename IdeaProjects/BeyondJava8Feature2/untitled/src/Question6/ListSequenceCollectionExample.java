package Question6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Demonstrate the use of addFirst(), addLast, removeFirst(), removeLast, getFirst(),
//getLast(), reversed() in Set and List Sequenced collections
public class ListSequenceCollectionExample {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("Amar");
        list.addFirst("Arsh Nadeem");
        list.addLast("Vivek Kumar Singh");

        System.out.println(list); // [Arsh Nadeem, Amar, Vivek Kumar Singh]
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.reversed());

        list.removeFirst();
        list.removeLast();
        System.out.println(list);



    }
}
