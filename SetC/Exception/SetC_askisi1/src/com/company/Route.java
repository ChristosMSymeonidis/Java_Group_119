package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Route {
    /*Fields*/
    private int id;
    private int aeroplane;
    private String departure;
    private String arrival;
    private ArrayList<Ticket> tickets;
    /*Dimiourgoume ena pedio typou Train gia na exoume prosvasi
      sta pedia tis klassis train pou xreiazontai
      gia ta exceptions opws MaxPassenger i to id tou trenou */
    private Train train;
    /*Constructors*/
    public Route(int id, int aeroplane, String departure, String arrival, ArrayList<Ticket> tickets,Train train) {
        this.id = id;
        this.aeroplane = aeroplane;
        this.departure = departure;
        this.arrival = arrival;
        this.tickets = tickets;  
        this.train = train;
    }

    public Route() {
       id=0;
       aeroplane=0;
       departure="";
       arrival="";
       tickets = new ArrayList<>();
      // train = new train;
    }
    /*Setters and getters*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAeroplane() {
        return aeroplane;
    }

    public void setAeroplane(int aeroplane) {
        this.aeroplane = aeroplane;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }
    /*Add ticket*/
    public void addTicket(Ticket ticket) {// exception
        if (tickets.size() > train.getMaxPassenger()) {// elegxos gia kenes theseis
            throw new ArithmeticException("No empty seats.");
        } else if (ticket.getId() != id) {
            throw new ArithmeticException("Wrong ticket id");// elegxos gia kwdiko
        } else if (ticket.getArrival() != arrival) {
            throw new ArithmeticException("Different arrival field writen on train and on ticket");// elegxos proorismou
        } else if (ticket.getDeparture() != departure) {
            throw new ArithmeticException("Different departure field writen train and on ticket");// elegxos anaxwrisis
        } else if (ticket.getDistance() == 0) {
            throw new ArithmeticException("I apostasi pou dilwthike sto eisitirio einai isi me miden ");// elegxos anaxwrisis
        }

        tickets.add(ticket);
    }
    /*finalise*/
    @Override
    public void finalize()
	{
        System.out.println("Route " + id);
        if (tickets.size() != 0) {// To arraylist tickets den einai keno
            System.out.println("OK - At least one passenger is on!");
            System.out.println(toString());
        } else {// To arraylist tickets  einai keno
            System.out.println("ERROR - No passengers!!!");
        }
	}
    /*To string*/
    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                ", aeroplane=" + aeroplane +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", tickets=" + tickets +
                '}';
    }

}
