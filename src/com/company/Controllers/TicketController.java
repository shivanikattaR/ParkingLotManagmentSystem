package com.company.Controllers;

import com.company.Model.Ticket;
import com.company.Services.TicketService;
import com.company.dto.GenerateTicketRequestDto;
import com.company.dto.GenerateTicketResponseDto;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto requestDto) {

        Ticket ticket = ticketService.generateTicket(requestDto.getVehicle(), requestDto.getEntryGate());
        GenerateTicketResponseDto responseDto = new GenerateTicketResponseDto();
        responseDto.setTicket(ticket);

        return responseDto;
    }
}
