package com.company.Model;

public class ElectricParkingSpot extends ParkingSpot{
    private ElectricCharger electricCharger;

    public ElectricParkingSpot(ElectricCharger electricCharger){
        this.electricCharger = electricCharger;
    }

    public ElectricCharger getElectricCharger() {
        return electricCharger;
    }

    public void setElectricCharger(ElectricCharger electricCharger) {
        this.electricCharger = electricCharger;
    }
}
