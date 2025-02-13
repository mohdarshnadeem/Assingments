package Question1;

import java.util.stream.Stream;

public class IteraterExample {
    public static void main(String[] args) {
                 Stream
                .iterate(0, a->a+2)
                .limit(20)
                .skip(1)
                .forEach(System.out::println);
    }
}
