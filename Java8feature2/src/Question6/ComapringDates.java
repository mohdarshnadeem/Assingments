package Question6;

import java.time.LocalDate;
import java.util.Scanner;

public class ComapringDates {
    public static void main(String[] args) {
// to sovle this question we will use date time api that was Introduced in java 8 date and time api
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter both date in a given format(yyyy-mm-dd):");
        LocalDate localDate = LocalDate.parse(sc.nextLine());
        LocalDate localDate1 = localDate.parse(sc.nextLine());

        if(localDate.isBefore(localDate1)) {
            System.out.println("Firstdate is before second");
        }else if(localDate.isAfter(localDate1)){
            System.out.println("FirstDate is after second");
        }else{
            System.out.println("both are equal");
        }
    }
}
