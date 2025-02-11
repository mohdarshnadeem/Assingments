package Question1;

import java.util.function.Supplier;

public class SupplierExample  {
    public static void main(String[] args) {

        Supplier<String> supplier = () ->  "Hi Arsh here";
        System.out.println(supplier.get());

    }
}
