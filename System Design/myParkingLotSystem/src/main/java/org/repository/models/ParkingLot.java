package org.repository.models;

import org.repository.models.parkingSpot.ParkingSpot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import static java.util.Objects.isNull;

public class ParkingLot {
    private String id;
    private Address address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private static ParkingLot _parkingLot = null;
    private HashMap<String, Floor> floors = new HashMap<>();

    public HashMap<String, Floor> getFloors() {
        return floors;
    }


    private HashMap<String, EntranceTerminal> entranceTerminals = new HashMap<>();

    private HashMap<String, ExitTerminal> exitTerminals = new HashMap<>();

    private ParkingLot() {}


    // make the class singleton
    public static ParkingLot getInstance(){
        if(_parkingLot == null){
            _parkingLot = new ParkingLot();
        }
        return _parkingLot;
    }

    public boolean addFloor(Floor floor){
        if(isNull(floor) || this.floors.containsKey(floor.getFloorId())) return false;
        this.floors.put(floor.getFloorId(), floor);
        return true;
    }
    public void addParkingSpot(ParkingSpot parkingSpot, String floorId){
        _parkingLot.getFloors().get(floorId).addParkingSpot(parkingSpot);
    }
    public boolean removeFloor(Floor floor){
        if(isNull(floor) || !this.floors.containsKey(floor.getFloorId())) return false;
        floors.remove(floor.getFloorId());
        return true;
    }
    public boolean addEntranceTerminal(EntranceTerminal entranceTerminal){
        if(isNull(entranceTerminal) || this.entranceTerminals.containsKey(entranceTerminal.getTerminalId()))
            return false;
        this.entranceTerminals.put(entranceTerminal.getTerminalId(), entranceTerminal);
        return true;
    }
    public boolean removeEntranceTerminal(EntranceTerminal entranceTerminal){
        if(isNull(entranceTerminal) || !this.entranceTerminals.containsKey(entranceTerminal.getTerminalId()))
            return false;
        entranceTerminals.remove(entranceTerminal.getTerminalId());
        return true;
    }

    public boolean addExitTerminal(ExitTerminal exitTerminal){
        if(isNull(exitTerminal) || this.exitTerminals.containsKey(exitTerminal.getTerminalId()))
            return false;
        this.exitTerminals.put(exitTerminal.getTerminalId(), exitTerminal);
        return true;
    }
    public boolean removeExitTerminal(ExitTerminal exitTerminal){
        if(isNull(exitTerminal) || !this.exitTerminals.containsKey(exitTerminal.getTerminalId())) return false;
        exitTerminals.remove(exitTerminal.getTerminalId());
        return true;
    }

    // entrance panels
    // exits panels
}
