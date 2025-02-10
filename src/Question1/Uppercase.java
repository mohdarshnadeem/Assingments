package Question1;
@FunctionalInterface
public interface Uppercase {
    String toUppercaseConversion(String s);
}

class UpppercaseExample{
    public static void main(String[] args) {
        Uppercase uppercase = (s) -> s.toUpperCase();

        System.out.println(uppercase.toUppercaseConversion("arsh"));
    }


}

