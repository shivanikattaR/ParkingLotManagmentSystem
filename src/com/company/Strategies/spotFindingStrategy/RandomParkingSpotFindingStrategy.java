package com.company.Strategies.spotFindingStrategy;

import com.company.Model.*;
import com.company.Services.ParkingSpotVehicleTypeMatchingService;

public class RandomParkingSpotFindingStrategy implements ParkingSpotFindingStrategy{
    private ParkingSpotVehicleTypeMatchingService parkingSpotVehicleTypeMatchingService;

    public RandomParkingSpotFindingStrategy(ParkingSpotVehicleTypeMatchingService parkingSpotVehicleTypeMatchingService){
        this.parkingSpotVehicleTypeMatchingService = parkingSpotVehicleTypeMatchingService;
    }
    @Override
    public ParkingSpot getAvailableSpot(VehicleType vehicleType, ParkingLot parkingLot) {
        for(ParkingFloor parkingFloor : parkingLot.getParkingFloors()){
            for(ParkingSpot parkingSpot: parkingFloor.getParkingSpotList()){
                if(parkingSpotVehicleTypeMatchingService.matches(parkingSpot.getSpotType(), vehicleType) && parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE)){
                    return parkingSpot;
                }
            }
        }
        return null;
    }
}
