package Question45;

public class SealedExample {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle truck = new Truck();
        Vehicle motorCycle = new MotorCycle();
        Vehicle cycle = new Cycle();
        Vehicle pickup = new PickupTruck();

        car.drive();
        truck.drive();
        pickup.drive();
        motorCycle.drive();
        cycle.drive();
    }
}
