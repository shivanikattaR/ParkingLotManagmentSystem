package com.company.Model;

import java.util.List;

public class ParkingLot extends BaseModel {
    private String address;
    private List<ParkingFloor> parkingFloors;
    private List<Gate> Gates;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return Gates;
    }

    public void setGates(List<Gate> gates) {
        Gates = gates;
    }
}
