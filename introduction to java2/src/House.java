public enum House {

    APARTMENT(50000),
    FLAT(150000),
    BUNGALOW(250000),
    FARMHOUSE(120000);

//    to store prices, making final so prices cannot be altered
    private final int price;

//    constructor for price initialization
    House(int price) {
        this.price = price;
    }

    // Getting the price
    public int getPrice() {
        return price;
    }

}

