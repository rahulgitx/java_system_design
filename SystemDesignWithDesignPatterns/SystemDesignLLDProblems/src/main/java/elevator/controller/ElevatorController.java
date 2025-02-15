package elevator.controller;

import elevator.model.Elevator;

import java.util.List;
import java.util.PriorityQueue;

public class ElevatorController {
    private Elevator elevator;
    PriorityQueue<Character> pickupDestinationsUp = new PriorityQueue<>();
    PriorityQueue<Character> pickupDestinationsDown = new PriorityQueue<>();
    PriorityQueue<Character> dropDestinationsUp = new PriorityQueue<>();
    PriorityQueue<Character> dropDestinationsDown = new PriorityQueue<>();


    public void addDestination(char c){

    }
    char getDirection(){
        return elevator.getDirection();
    }

}
