package com.company.Repositories;

import com.company.Model.Gate;
import com.company.Model.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    private Map<Long, ParkingLot> parkingLotMap = new HashMap<>();

    private Map<Gate, ParkingLot> gateParkingLotMap = new HashMap<>(); // to emulate index in DB

    public ParkingLot getParkingLotWhereGatesContain(Gate gate){
        if(gateParkingLotMap.containsKey(gate)){
            return gateParkingLotMap.get(gate);
        }
        return null;
//        for(ParkingLot parkingLot: parkingLotMap.values()){
//            if(parkingLot.getGates().contains(gate)){
//                return parkingLot;
//            }
//        }
    }

    public ParkingLot save(ParkingLot parkingLot){
        parkingLotMap.put(parkingLot.getId(),parkingLot); // if we use only first map
        for(Gate gate: parkingLot.getGates()){
            gateParkingLotMap.put(gate, parkingLot);
        }
        return parkingLot;
    }


}
