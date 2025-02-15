package elevator.model;

import elevator.InternalDisplay;
import elevator.InternalPanel;
import elevator.controller.ElevatorController;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Elevator {
    private int elevatorId;
    private boolean doorOpen;
    private char currFloor;
    private char direction;
    private InternalPanel internalPanel;
    private ElevatorController elevatorController;
}
