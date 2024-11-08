package com.company.Services;

import com.company.Model.EntryGate;
import com.company.Model.ParkingSpot;
import com.company.Model.Ticket;
import com.company.Model.Vehicle;
import com.company.Repositories.ParkingLotRepository;
import com.company.Strategies.spotFindingStrategy.ParkingSpotFindingStrategy;

import java.util.Date;

public class TicketService {
    private ParkingSpotFindingStrategy parkingSpotFindingStrategy;

    private ParkingLotRepository parkingLotRepository;

    public TicketService(ParkingSpotFindingStrategy parkingSpotFindingStrategy, ParkingLotRepository parkingLotRepository){
        this.parkingSpotFindingStrategy = parkingSpotFindingStrategy;
        this.parkingLotRepository = parkingLotRepository;
    }

    public Ticket generateTicket(Vehicle vehicle, EntryGate entryGate){
        ParkingSpot availableSpot = parkingSpotFindingStrategy.getAvailableSpot(vehicle.getVehicleType(),parkingLotRepository.getParkingLotWhereGatesContain(entryGate));

        Ticket ticket = new Ticket();
        ticket.setGeneratedBy(entryGate.getOperator());
        ticket.setGate(entryGate);
        ticket.setVehicle(vehicle);
        ticket.setParkingSpot(availableSpot);
        ticket.setEntryTime(new Date().toString());


        return ticket;
    }

}
