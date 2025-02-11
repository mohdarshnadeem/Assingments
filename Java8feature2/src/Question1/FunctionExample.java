package Question1;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> function = (a) -> a.length();
        System.out.println(function.apply("Arsh"));

        Function<String, String> function1 = a -> "Message: " +a;
        Function<String, String> function2 = b -> b.toUpperCase();
        Function<String, String> function3 = function2.andThen(function1);

        String result = function3.apply("Hello");
        System.out.println(result);
    }
}
