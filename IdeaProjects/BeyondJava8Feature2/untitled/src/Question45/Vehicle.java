package Question45;

public sealed abstract class Vehicle permits Car, Truck, MotorCycle {
    public abstract void drive();
}
