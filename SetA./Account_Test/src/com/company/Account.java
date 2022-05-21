package com.company;
import java.util.Scanner;
class Account {

    private  final int accNum;
    private static int rythmistisAccnumber=0;
    private String name;
    private double balance;
    private double blockedAmount;
    /*    Constructors */
    public Account( ){
        rythmistisAccnumber++;
        accNum=rythmistisAccnumber;
        name = "";
        balance=0.0;
        blockedAmount=0.0;
    }
    public Account( String onoma, double ypoloipo ){
        rythmistisAccnumber++;
        accNum=rythmistisAccnumber;
        name = onoma;
        balance = ypoloipo;
        blockedAmount=0.0;
    }
    /*    Methods     */
    public void read(){
        System.out.println("Eisagete onoma");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        do{
            System.out.println("Eisagete thetiko balance");
            balance = input.nextDouble();
        }while(balance <0);//  balance   >=0
    }
    public int getAccNumber(){
        return accNum;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
    public double getAvailabeBalance(){
        return balance - blockedAmount;
    }
    public void withdraw(double amount){
        if (amount<0){
            System.out.println("Den mporeite na kanete analipsi arnitiko poso,try again");
        }
        else if (balance>=amount ){
            balance-=amount;
        }
        else{
            System.out.println("Mi diathesimo ypoloipo gia amalipsi: "+amount+" euro");// akyrwsi analipsis 
        }
    }
    public void deposit(double amount){
        if (amount<0){
            System.out.println("Den mporeite na kanete katathesi arnitiko poso,try again");
        }
        else {
            balance += amount;
        }
    }
    public void cardPurchase(double amount){
        if (amount<0){
            System.out.println("Auti i energeia den mporei na ginei me arnitiko poso,try again");
        }
        else if(amount<=balance-blockedAmount){
            System.out.println("Mporei na ginei i agora me pistwtiki");
            blockedAmount+=amount;

        }
        else{
            System.out.println("Den mporei   na kseperasei   to desmeumeno poso to ypoloipo sas");// blocked amount <= balance kai akyrwsi
        }
    }
    public void withdrawBlockedAmount (double amount){
        if (amount<0){
            System.out.println("Auti i energeia den mporei na ginei me arnitiko poso,try again");
        }
        else if(amount <= blockedAmount){
            System.out.println("Mporeis na pareis "+ amount+ " apo ta desmeumena ");
            blockedAmount-=amount;
            balance-=amount;
        }
        else{
            System.out.println("Den mporeis na pareis "+ amount+ " apo ta desmeumena ");// akyrwsi analipsis apo epaggelmatia
        }
    }
    public void print(){
        System.out.println("\n/**********************************************/");
        System.out.println("Arithmos logariasmou: " + getAccNumber());
        System.out.println("Onoma logariasmou: " + getName());
        System.out.println("Ypoloipo: " + getBalance());
        System.out.println("Blocked amount : " + (getBalance()-getAvailabeBalance()));//blockedAmount);
        System.out.println("Poso gia agores me  karta: " + getAvailabeBalance());
        System.out.println("/**********************************************/\n");
    }
}