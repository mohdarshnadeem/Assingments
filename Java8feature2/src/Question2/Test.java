package Question2;

public class Test implements DefaultStaticExample {
    public static void main(String[] args) {
        System.out.println("hi");

        DefaultStaticExample def = new Test();
        System.out.println(def.multiply(4,5));

        System.out.println(DefaultStaticExample.sum(23,54));
    }
}
