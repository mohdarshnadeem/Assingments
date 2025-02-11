package Question2;

public interface DefaultStaticExample {
    public static void main(String[] args) {
        System.out.println("hello");
    }

    static int sum(int a, int b){
        return a+b;
    }

    default int multiply(int a, int b){
        return a*b;
    }
}


