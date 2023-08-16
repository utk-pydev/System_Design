package FactoryPattern;

public class MotorCycleFactory extends MotorVehicleFactory{
    @Override
    protected MotorVehicle creatorMotorVehicle(){
        return new MotorCycle();
    }
}
