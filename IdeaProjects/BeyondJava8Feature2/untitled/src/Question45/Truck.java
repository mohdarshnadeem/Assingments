package Question45;

import org.w3c.dom.ls.LSOutput;

public sealed class Truck extends Vehicle permits PickupTruck {
    @Override
    public void drive(){
        System.out.println("Driving the Truck");
    }
}

final class PickupTruck extends Truck{
    @Override
    public void drive() {
        System.out.println(" driving the Pickup! Will not be Parent for Anyone");
    }
}
