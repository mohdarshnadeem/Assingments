package Question3;

public class Main {
    public static void main(String[] args) {
        SpecialStack sp = new SpecialStack(20);
        sp.push(10);
        sp.push(12);
        sp.pop();
        sp.push(4);
        sp.push(6);
        sp.push(20);

        System.out.println("Min element: "+sp.getMin());
        sp.pop();
        System.out.println();

        System.out.print("Min element: "+sp.getMin());
        System.out.println();
    }


}
