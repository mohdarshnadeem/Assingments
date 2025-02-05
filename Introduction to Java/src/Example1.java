public class Example1 {

    static String firstName = "Arsh";
    static String lastName = "Nadeem";
    static int age = 23;

    static{
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
    }

    static void details(){
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Example1.details();
    }
}
