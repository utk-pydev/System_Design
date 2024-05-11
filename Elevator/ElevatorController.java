package Elevator;

import java.util.*;

public class ElevatorController implements IElevatorController, ElevatorEventListener {
    private int numElevators;
    private int numFloors;
    private Elevator []elevators = null;
    private ArrayList<Queue<Integer>>passengers = null;

    private void initElevators(int numElevators, int numFloors){
        if(numFloors < 0)throw new IllegalArgumentException();
        elevators = new Elevator[numElevators];
        for(int i = 0; i < numElevators; i++){
            Elevator el = new Elevator(numFloors);
            el.setElEventListener(this);
            elevators[i] = el;
        }
    }
    private void initFloors(int numFloors){
        if(numFloors < 0)throw new IllegalArgumentException();
        passengers = new ArrayList<Queue<Integer>>(numFloors);
        for(int i = 0; i < numFloors; i++) {
        //    passengers.add(i,
            //           new Queue<Integer>());
        }
    }
    public ElevatorController(int numElevators, int numFloors){
        initFloors(numFloors);
        initFloors(numElevators);
        this.numElevators = numElevators;
        this.numFloors = numFloors;
    }

    private int calculateRoute(int xfloor, int xefloor, int tfloor){
        return calculateRoute(xefloor, tfloor)+calculateRoute(xfloor, tfloor);
    }

    public Queue<Integer> getPassengers(int floor){
        if(floor < 0 || floor >= numFloors)throw new IllegalArgumentException();
        return passengers.get(floor);
    }
    public void setPassengers(Queue<Integer>passengers, int floor){
        if(passengers == null)throw new NullPointerException();
        if(floor < 0 || floor >= numFloors)throw new IllegalArgumentException();
        this.passengers.add(floor, passengers);
    }

    private int calculateRoute(int afloor, int bfloor){
        return Math.abs(afloor-bfloor);
    }
    
    @Override
    public void onStopped(Object sender) {
        Queue<Integer> psQueue = getPassengers(((Elevator)sender).getCurrentFloor());
        if(psQueue == null)return;
        if(psQueue.isEmpty())return;
        for(Integer goalFloor : psQueue){
            ((Elevator)sender).setGoalFloor(goalFloor);
        }
    }

    @Override
    public void status() {

    }

    @Override
    public Elevator getElevator(int elevatorId) {
        if(elevatorId < 0 || elevatorId >= numElevators)throw new NoSuchElementException();
        return elevators[elevatorId] ;
    }

    @Override
    public void update(int elevatorId, int floor) {
        if(floor < 0 || floor >= numFloors)throw new IllegalArgumentException();
        if(elevatorId < 0 || elevatorId >= numElevators)throw new NoSuchElementException();
        Elevator el = elevators[elevatorId];
        el.setGoalFloor(floor);
    }

    @Override
    public void pickup(int floor, boolean direction) {
        if(floor < 0 || floor >= numFloors)throw new IllegalArgumentException();
        int [] elevatorIDs = new int[numElevators];
        for(int i = 0; i < numElevators; i++)elevatorIDs[i] = i;
        //StdRandom.shuffle(elevatorIDs);
        Elevator.DIRECTION userDirection = (direction) ? (Elevator.DIRECTION.UP):(Elevator.DIRECTION.DOWN);

    }

    @Override
    public void reset(int elevatorId, int floor) {

    }

    @Override
    public void step() {
        for(Elevator elevator : elevators)elevator.moveNext();
    }
}
