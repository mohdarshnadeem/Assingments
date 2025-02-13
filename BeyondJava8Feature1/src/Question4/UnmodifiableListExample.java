package Question4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnmodifiableListExample {
    public static void main(String[] args) {
        Stream<String> st = Stream.of("Arsh", "Nadeem", "Anurag", "TTN", "Rohit","Guptas");

        List<String> unmodifiable = st.collect(Collectors.toUnmodifiableList());
        System.out.println("Unmodifiable List" + unmodifiable);
        //unmodifiable.add("Vivek");Exception in thread "main" java.lang.UnsupportedOperationException




    }
}
