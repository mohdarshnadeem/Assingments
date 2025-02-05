public class EnumExample {
    public static void main(String[] args) {
        System.out.println("House with prices: ");

//finding all prices
        for (House h : House.values()) {
            System.out.println(h + " costs in rupee " + h.getPrice());
        }
    }
}
