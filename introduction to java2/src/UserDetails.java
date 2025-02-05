import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class User{
    private String fname, lName, phone;
    private int age;

    public User(String fname, String lName, String phone, int age) {
        this.fname = fname;
        this.lName = lName;
        this.phone = phone;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "fname='" + fname + '\n' +
                ", lName='" + lName + '\n' +
                ", phone='" + phone + '\n' +
                ", age=" + age +
                '}';
    }
}


public class UserDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
// I will use try with resources which will automatically close the resource.
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("user.txt",true))){
//          loop will execute until stopped
            while(true) {
                System.out.print("First name: ");
                String fname = sc.next();
                System.out.print("Last name: ");
                String lname = sc.next();
                System.out.print("Age: ");
                int age = sc.nextInt();
                System.out.print("Phone number: ");
                String phone = sc.next();
// After reading age and phone, I added an extra sc.nextLine()
// to consume the leftover newline.
// This clears the buffer and ensure the next sc.nextLine()
// actually waits for user input. otherwise it will skip
                sc.nextLine();

                writer.write(new User(fname, lname, phone, age).toString());
                writer.newLine();

                System.out.println("adding user successfully");
                System.out.println("type QUIT to exit");
                String choice = sc.nextLine();
                if (choice.equals("QUIT")) break;
            }
        }catch (IOException | NumberFormatException e){
            System.out.println("error" + e.getMessage());
        }finally{
            sc.close();
        }
        System.out.println("Exiting....");
    }
}
