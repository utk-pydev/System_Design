package FactoryPattern;

public class CarFactory extends MotorVehicleFactory{
    @Override
    protected MotorVehicle creatorMotorVehicle(){
        return new Car();
    }
}
