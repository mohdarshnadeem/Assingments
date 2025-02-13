package Question6;

public class OrderManagement {
    enum OrderStatus { PENDING, PROCESSING, SHIPPED,
            DELIVERED, CANCELLED, REFUNDED }

    public static String orderStatusProcessing(OrderStatus status){
        return switch (status){
            case PENDING -> "Order is awaiting confirmation.";
            case PROCESSING -> "Order is being prepared.";
            case SHIPPED -> "Order has been dispatched.";
            case DELIVERED -> "Order has been Successfully delivered";
            //Here, yield is necessary because extra processing  System.out.println("Customer is canceling the order");
            // is done before returning the result.
            case CANCELLED -> {
                System.out.println("Customer is canceling the order");
               String canceled= "Order has been canceled";
               yield canceled;// complex processing using yield.
            }
            case REFUNDED -> "Refund has been issued for the order";
        };
    }

    public static void main(String[] args) {
        System.out.println(orderStatusProcessing(OrderStatus.PENDING));
        System.out.println(orderStatusProcessing(OrderStatus.PROCESSING));
        System.out.println(orderStatusProcessing(OrderStatus.SHIPPED));
        System.out.println(orderStatusProcessing(OrderStatus.DELIVERED));
        System.out.println(orderStatusProcessing(OrderStatus.CANCELLED));
        System.out.println(orderStatusProcessing(OrderStatus.REFUNDED));
    }

}
