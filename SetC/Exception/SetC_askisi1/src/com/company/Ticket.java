package com.company;

import java.util.Scanner;

public class Ticket {
    /*Fields*/
    private int id;
    private String passenger;
    private String departure;
    private String arrival;
    private float distance;
    private float cost;
    /*Constructors*/
    public Ticket(int id, String passenger, String departure, String arrival, float distance, float cost) {
        this.id = id;
        this.passenger = passenger;
        this.departure = departure;
        this.arrival = arrival;
        this.distance = distance;
        this.cost = cost;
    }

    public Ticket() {
         id=0;
        passenger="";
        departure="";
        arrival="";
        distance=0.0f;
        cost=0.0f;
    }
    /*Setters and getters*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassenger() {
        return passenger;
    }

    public void setPassenger(String passenger) {
        this.passenger = passenger;
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

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    /*Read*/
    public void ReadTicket() {
        Scanner input=new Scanner(System.in);
        System.out.println("Give dromologio id:");
        id=input.nextInt();
        System.out.println("Give passenger name:");
        passenger=input.next();
        System.out.println("Give departure place :");
        departure=input.next();
        System.out.println("Give arrival place :");
        arrival=input.next();
        System.out.println("Give distance km  :");
        distance=input.nextFloat();
        System.out.println("Give cost km  :");
        cost=0.25f*distance;
		if(cost <0 || cost==0)
		{
			throw new ArithmeticException("To kostos den mporei na einai miden i arnitiko");
		}
		else
		{
		  System.out.println("To kostos ypologistike swsta");
		}
    }

    /*To string*/
    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", passenger='" + passenger + '\'' +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", distance=" + distance +
                ", cost=" + cost +
                '}';
    }
}
