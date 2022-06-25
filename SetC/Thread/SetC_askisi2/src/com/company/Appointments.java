package com.company;

import java.util.Scanner;

public class Appointments {
    private final int ID;
    private static int rythmistisID = 0;
    private String employee;
    private String customer;


    public Appointments() {
        rythmistisID++;
        ID = rythmistisID;
        employee = "";
        customer = "";
    }

    public Appointments(String employee, String customer) {
        rythmistisID++;
        ID = rythmistisID;
        this.employee = employee;
        this.customer = customer;
    }

    public int getID() {
        return ID;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void read() {
        Scanner input = new Scanner(System.in);// elegxos ?
        System.out.println("Give doctor name:");
        employee = input.next();
        System.out.println("Give civilian name:");
        customer = input.next();

    }

    private int epomenoRantevou = 0;     // epomenoRantevou pros eksypyretisi

    private int serving = 0;  // Next customer to serve

    public synchronized int epomeniEksypyretisi() {
        epomenoRantevou = epomenoRantevou + 1;
        return epomenoRantevou;
    } // epomeniEksypyretisi()

    public synchronized int epomenosPelatis(int EmployeeID) {
        try {
            while (epomenoRantevou <= serving) {
                System.out.println("\nTameias " + EmployeeID + " waiting ");
                wait();
            }
            ++serving;
            System.out.println("\nTameias  " + EmployeeID + " eksypiretei to noumero " + serving);
            return serving;
        } catch (InterruptedException e) {
            System.out.println("Exception " + e.getMessage());
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Appointments{" +
                "ID=" + ID +
                ", employee='" + employee + '\'' +
                ", customer='" + customer + '\'' +
                '}';
    }
}
