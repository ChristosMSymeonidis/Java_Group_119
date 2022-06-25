package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class IndirectRoute extends Route{
    /*Fields*/
    private String middlestop;

    /*Constructors*/
    public IndirectRoute(int id, int aeroplane, String departure, String arrival, ArrayList<Ticket> tickets,Train train, String middlestop) {
        super(id, aeroplane, departure, arrival, tickets,train);
        this.middlestop = middlestop;
    }

    public IndirectRoute() {
         middlestop="";
    }
    /*Setters and getters*/
    public String getMiddlestop() {
        return middlestop;
    }

    public void setMiddlestop(String middlestop) {
        this.middlestop = middlestop;
    }
    /*Add ticket*/
    @Override
    public void addTicket(Ticket ticket) {//
        super.addTicket(ticket);
        if (getTickets().size() > getTrain().getMaxPassenger()) {
            throw new ArithmeticException("No empty seats.");// elegxos gia kenes theseis
        } else if (ticket.getId() != getId()) {
            throw new ArithmeticException("Wrong ticket id");// elegxos gia kwdiko
        } else if (ticket.getArrival() != getArrival()) {
            throw new ArithmeticException("Different arrival writen on train and on ticket");// elegxos proorismou
        }
          else if (ticket.getDeparture() != getDeparture()) {
            throw new ArithmeticException("Different departure writen on train and on ticket");// elegxos anaxwrisis
        }
        else if (ticket.getDistance() == 0) {
            throw new ArithmeticException("I apostasi pou dilwthike sto eisitirio einai isi me miden ");// elegxos anaxwrisis
        }
        getTickets().add(ticket);
	
    }
    /*finalise*/
    @Override
    public void finalize() {
        super.finalize();
        System.out.println("Route " + getId());
        if (getTickets().size() != 0) {// To arraylist tickets den einai keno
            System.out.println("OK - At least one passenger is on after the middlestop!");
            System.out.println(toString());
        } else {// To arraylist tickets einai keno
            System.out.println("ERROR - No passengers after the middlestop!!!");
        }
    }
    /*To string*/
    @Override
    public String toString() {
        return "IndirectRoute{" +
                "middlestop='" + middlestop + '\'' +
                '}';
    }


}
