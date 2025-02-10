package Question1;
@FunctionalInterface
public interface Concatenation {
    String concate(String a, String b);
}

class ConcatenationExample{
    public static void main(String[] args) {
        Concatenation concatenation = (a,b) -> {return a+b;};

        System.out.println(concatenation.concate("Arsh", " Nadeem"));
    }

}
