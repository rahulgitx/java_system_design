package elevator;

import elevator.ExternalDisplay;
import elevator.InternalDisplay;
import elevator.controller.ElevatorController;
import elevator.model.Elevator;

import java.util.HashMap;

public class InternalPanel {
    private InternalDisplay internalDisplay;
    HashMap<Character, Boolean> buttons = new HashMap<>();

    void pressButton(Elevator elevator, char c){
        elevator.getElevatorController().addDestination(c);
    }
}
