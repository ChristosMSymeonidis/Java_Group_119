package com.company;

import java.util.Scanner;

public class Train {
    /*Fields*/
    private int id;
    private String model;
    private int maxPassenger;
	/*Constructors*/
    public Train(int id, String model, int maxPassenger) {
        this.id = id;
        this.model = model;
        this.maxPassenger = maxPassenger;
    } 
    public Train() {
        id = 0;
        model = "";
       maxPassenger = 0;
    }
	/*Setters and getters*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }
	/*Read*/
    public void ReadTrain() {
        Scanner input=new Scanner(System.in);
        System.out.println("Give train id:");
        id=input.nextInt();
        System.out.println("Give model:");
        model=input.next();
        System.out.println("Give payment per day:");
        maxPassenger=input.nextInt();
    }
	/*To string*/
    @Override
    public String toString() {
        return "Train{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", maxPassenger=" + maxPassenger +
                '}';
    }

}
