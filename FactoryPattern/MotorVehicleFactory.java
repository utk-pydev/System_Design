package FactoryPattern;

public abstract class MotorVehicleFactory {
    public MotorVehicle create(){
        MotorVehicle vehicle = creatorMotorVehicle();
        vehicle.build();
        return vehicle;
    }

    protected abstract MotorVehicle creatorMotorVehicle();

}
