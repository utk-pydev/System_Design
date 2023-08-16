package FactoryPattern;

public class Car implements MotorVehicle{
    @Override
    public void build(){
        System.out.println("Build a Car");
    }
}
