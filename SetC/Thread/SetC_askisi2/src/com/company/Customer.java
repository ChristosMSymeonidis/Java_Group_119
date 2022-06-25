package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Customer implements Runnable {
    private final int CustomerID;
    private static int rythmistisCustomerID = 0;
    private String name;
    //private ArrayList<Appointments> rantevou;
    private Appointments rantevou;

    public Customer() {
        rythmistisCustomerID++;
        CustomerID = rythmistisCustomerID;
        name = "";
    }

    public Customer(Appointments rantevou) {
        rythmistisCustomerID++;
        this.rantevou = rantevou;
        CustomerID = rythmistisCustomerID;
        // this.name = name;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public static int getRythmistisCustomerID() {
        return rythmistisCustomerID;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void read() {
        Scanner input = new Scanner(System.in);// elegxos ?
        System.out.println("Give  name:");
        name = input.next();
    }

    public void run() {

        try {
            Thread.sleep((int) (5000 - 3000 * Math.random()));

            rantevou.epomeniEksypyretisi();

        } catch (InterruptedException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeID=" + CustomerID +
                ", name='" + name + '\'' +
                '}';
    }
}
