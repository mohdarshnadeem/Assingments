package Question1;
@FunctionalInterface
public interface Incrementor {
    int increment(int a);
}

class IncrementExample{
    public static void main(String[] args) {
        Incrementor incrementor = (a)-> a+1;

        System.out.println(incrementor.increment(3));
    }
}
