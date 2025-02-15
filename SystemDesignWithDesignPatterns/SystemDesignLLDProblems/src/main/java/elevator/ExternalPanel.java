package elevator;

import elevator.controller.ElevatorController;
import elevator.dispatcher.ExternalButtonDispatcher;
import elevator.model.Buttons;
import elevator.model.Elevator;

import java.util.HashMap;

public class ExternalPanel {
    private ExternalDisplay externalDisplay;
    private ElevatorController elevatorController;
    private ExternalButtonDispatcher externalButtonDispatcher;
    HashMap<Character, Boolean> buttons = new HashMap<>();
    ExternalPanel(boolean downButtonPresent, boolean upButtonPresent){
        if(upButtonPresent) this.buttons.put('u',false);
        if(downButtonPresent) this.buttons.put('d', false);
    }
    Elevator pressButton(int floorNo, char c){
        buttons.put(c, true);
        Elevator assignedElevator = externalButtonDispatcher.getNearestElevator(floorNo, c);
        buttons.put(c, false);
        return assignedElevator;
    }
}
