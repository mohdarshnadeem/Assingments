package Question5;

import java.util.Optional;

public class MethodsExample {
    public static void main(String[] args) {

        System.out.println("************repeat()**************");
        String name= "Arsh ".repeat(3);
        System.out.println(name);

        System.out.println("************strip()**************");
        String name1  = "\u2003Hello World\u2003".strip();//strip removes unicode spaces
        System.out.println(name1);

        System.out.println("************trim()**************");
        String name3 = "\u2003Hello World\u2003".trim();//trim does not remove unicode spaces
        System.out.println(name3);

        System.out.println("************isBlank(), isEmpty()**************");
        System.out.println("     ".isBlank()); // will return true are not hing is present  except spaces
        System.out.println("    ".isEmpty()); // will return false , consider spaces as not empty

        System.out.println("************indent()**************");
        System.out.println("Arsh".indent(3));// provide 3 words spaces

        System.out.println("************transform()**************");
        System.out.println((String)"Arsh".transform(a -> a.toUpperCase()));  // Output: ARSH ,excepts the lambda

        System.out.println("************multiLine()**************");
        String multiLine =
                 """
                            Arsh
                                 is
                            Good
                """;

        System.out.println("Original String:");
        System.out.println(multiLine);

        System.out.println("After stripIndent():");
        System.out.println(multiLine.stripIndent());

        System.out.println("************translateEscape()**************");
        System.out.println("Hello\\nWorld".translateEscapes());//translate the escape:
        //  translateEscapes() - Converts escape sequences into actual characters

        System.out.println("************formatted()**************");
        String formatted = "Hi %s, You have a meeting scheduled at %d".formatted("Arsh",5);
        System.out.println(formatted);





    }
}
