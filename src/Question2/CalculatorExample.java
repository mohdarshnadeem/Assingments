package Question2;

public class CalculatorExample {
    public static void main(String[] args) {
        Functions functions = new Functions();
//      we are using method reference in place of 'new' keyword, it simplifies our code
        Calculator summation = functions::sum;
        Calculator difference = functions::difference;

        Calculator multiplication = Functions::multiplication;
//      accessing the calculate method of Calculator interface via its reference
        System.out.println(summation.calculate(1,2));
        System.out.println(difference.calculate(4,2));
        System.out.println(multiplication.calculate(3,3));
    }
}
