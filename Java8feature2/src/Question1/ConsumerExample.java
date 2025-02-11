package Question1;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer consumer = (a) -> System.out.println(a);
        consumer.accept(32);

        Consumer<String> consumer1 = b -> System.out.println("message " + b);
        Consumer<String> consumer2 = b-> System.out.println("message " + b.toUpperCase());

        Consumer<String> combined =  consumer2.andThen(consumer1);
        combined.accept("Hello");
    }
}
