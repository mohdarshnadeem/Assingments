package Question1;

//created a functional interface with a method
public interface Gretest {
    boolean isGreatest(int a, int b);
}

class GreatestExample{
    public static void main(String[] args) {
//        passed a lambda function to reference of functional interface
        Gretest isGreat = (a,b) -> a>b;

//        accessing the method of functional interface via reference of it.
        System.out.println(isGreat.isGreatest(2,3));
        System.out.println(isGreat.isGreatest(3,2));
        System.out.println(isGreat.isGreatest(3,3));

    }
}
