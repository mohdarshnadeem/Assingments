import java.util.Scanner;

public class SimpleInputReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //using string-builder to store the result
        StringBuilder result = new StringBuilder();

        System.out.println(" Enter 'XDONE' to finish");

        String line;
        //checks if line equals to XDONE.
        while(!(line = sc.nextLine()).equals("XDONE")){
            result.append(line).append("\n");
        }

        System.out.println("Arsh Entered:\n"+ result);
        sc.close();
    }
}
