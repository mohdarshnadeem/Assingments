package bankingSystem;

public class Icici extends Bank{
    public Icici() {
//        this super refer to parent class bank allowing us to get the attributed
        super("ICICI", "Delhi", "xyz",
                200, 7.2f, 9.4f, 8.0f);
    }
}
