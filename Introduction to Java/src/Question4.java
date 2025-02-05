import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the element of 4*4: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4 ; i++) {
            int rowSum =0;
            for (int j = 0; j < 4; j++) {
                rowSum+= arr[i][j];
            }
            System.out.println( "sum of row "+ i +" is: "+ rowSum);
        }

        for (int i = 0; i < 4 ; i++) {
            int colSum =0;
            for (int j = 0; j < 4; j++) {
                colSum+= arr[j][i];
            }
            System.out.println( "sum of col "+ i +" is: "+ colSum);
        }

    }
}
