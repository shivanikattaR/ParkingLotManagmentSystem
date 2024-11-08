package com.company.Services;

import com.company.Model.SpotType;
import com.company.Model.VehicleType;

public class ParkingSpotVehicleTypeMatchingService {

   public boolean matches(SpotType spotType, VehicleType vehicleType){
        return switch (spotType){
            case SMALL -> vehicleType.equals(VehicleType.SMALL);
            case MEDIUM -> vehicleType.equals(VehicleType.MEDIUM);
            case LARGE -> vehicleType.equals(VehicleType.LARGE);
            case ELECTRIC -> vehicleType.equals(VehicleType.ELECTRIC);
        };
    }
}
