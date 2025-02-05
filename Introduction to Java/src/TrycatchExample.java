import java.util.InputMismatchException;
import java.util.Scanner;

public class TrycatchExample {

    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter numerator and denominator");

            try {
                int num = sc.nextInt();
                int deno = sc.nextInt();
                int result = num / deno;
                System.out.println(result);

                int[] arr = {1, 2, 3, 4};
                System.out.println("Enter which index element you want: ");
                System.out.println(arr[sc.nextInt()]);
            } catch (ArithmeticException e) {
                System.out.println("arthematic exception being caught");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Going out of bound");
            } catch (InputMismatchException e) {
                System.out.println("Arsh provided Wrong input ");
            } finally {
                System.out.println("This will always execute ");
                System.out.println("********done******");
                System.out.println();
            }
        }
    }
}
