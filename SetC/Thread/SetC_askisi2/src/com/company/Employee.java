package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee extends Thread {
    private final int EmployeeID;
    private static int rythmistisEmployeeID = 0;
    private String name;
   //  private ArrayList<Appointments> rantevou;
    private Appointments rantevou;

    public Employee() {
        rythmistisEmployeeID++;
        EmployeeID = rythmistisEmployeeID;
        name = "";
    }


    public Employee(Appointments rantevou) {
        rythmistisEmployeeID++;
        this.rantevou = rantevou;
        EmployeeID = rythmistisEmployeeID;
        // this.name = name;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public static int getRythmistisEmployeeID() {
        return rythmistisEmployeeID;
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
        while (true) {
            try {
                sleep((int) (10000 - 5000 * Math.random()));
                rantevou.epomenosPelatis(EmployeeID);
            } catch (InterruptedException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeID=" + EmployeeID +
                ", name='" + name + '\'' +
                '}';
    }
}
