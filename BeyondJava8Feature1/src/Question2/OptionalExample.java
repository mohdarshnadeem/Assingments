package Question2;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalExample {
    public static void main(String[] args) {
       List<Optional<String>> optionalList = List.of(
               Optional.of("Arsh"),
               Optional.of("Nadeem"),
               Optional.empty(),
               Optional.of("Is"),
               Optional.of("Student")
       );
        System.out.println(optionalList);
        System.out.println();
        List<String> student = optionalList.stream()
                .flatMap(Optional::stream)
                .collect(Collectors.toList());
//This is particularly useful when working with Stream operations, such as flatMap(),
// to avoid unnecessary Optional handling.

        System.out.println(student);
    }
}
