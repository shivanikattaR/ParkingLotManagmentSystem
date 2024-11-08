package com.company.Strategies.spotFindingStrategy;

import com.company.Model.ParkingLot;
import com.company.Model.ParkingSpot;
import com.company.Model.VehicleType;

public interface ParkingSpotFindingStrategy {
    ParkingSpot getAvailableSpot(VehicleType vehicleType, ParkingLot parkingLot);
}
