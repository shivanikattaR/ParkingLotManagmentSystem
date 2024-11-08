package com.company.dto;

import com.company.Model.Ticket;

public class GenerateTicketResponseDto { //Umbrella Dto
    private Ticket ticket;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
