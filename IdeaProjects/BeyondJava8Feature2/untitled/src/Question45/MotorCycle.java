package Question45;

public non-sealed class MotorCycle extends Vehicle {
    @Override
    public void drive(){
        System.out.println("This can be Extended Driving the motorcycle");
    }
}

class Cycle extends MotorCycle{
    @Override
    public void drive(){
        System.out.println("Cycle");
    }
}
