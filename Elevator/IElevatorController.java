package Elevator;

public interface IElevatorController {
    public void status();
    public Elevator getElevator(int elevatorId);
    public void update(int elevatorId, int floor);
    public void pickup(int floor, boolean direction);
    public void reset(int elevatorId, int floor);
    public void step();
}
