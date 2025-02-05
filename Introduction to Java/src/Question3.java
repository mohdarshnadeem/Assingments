import java.util.Scanner;

public class Question3 {

    static float area(float r){
        System.out.print("Area is: ");
        return (22f/7)*r*r;
    }

    static float circumference(float r){
        System.out.print("Circumference is: ");
        return 2*(22f/7)*r;
    }
    public static void main(String[] args) {
        while(true) {
            System.out.println("**********Menu**********");
            System.out.println("1. Calculate Area of Circle \n" +
                    "2. Calculate Circumference of a Circle\n" +
                    "3. Exit. \n");
            System.out.println("Choose an option (1-3):");

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Enter the Radius");
                    float radius1 = sc.nextFloat();
                    System.out.println(area(radius1));
                    break;
                case 2:
                    System.out.println("Enter the Radius");
                    float radius2 = sc.nextFloat();
                    System.out.println(circumference(radius2));
                    break;
                case 3:
                    break;
                default:
                    System.out.println("invalid input");
            }
        }
    }
}
