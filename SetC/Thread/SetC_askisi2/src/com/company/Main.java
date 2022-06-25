package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //ArrayList<Appointments> rantevou = new ArrayList<>();
        Appointments rantevou = new Appointments();
        Thread employee1 = new Thread(new Employee(rantevou));
        Thread employee2 = new Thread(new Employee(rantevou));
        Thread employee3 = new Thread(new Employee(rantevou));
        employee1.start();
        employee2.start();
        employee3.start();

        for (int k = 1; k <= 20; k++)
        {
            Thread pelatis = new Thread(new Customer(rantevou));
            pelatis.start();
        }
         /*Thread.getName() -- Arraylist()name//
         for (Appointments i : rantevou) {
            System.out.println(rantevou.toString());
        } */
    }
}
