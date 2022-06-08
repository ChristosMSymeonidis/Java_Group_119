package com.company;

import java.util.Scanner;

public abstract class Purchase implements Receipt {
    /*Fields*/
    private	int itemCode;
    private float amount ;
    /*Constructors*/
    public  Purchase(){
        itemCode = 0 ;
        amount   = 0 ;
    }

    public  Purchase(int iC, float poso){
        itemCode = iC ;
        amount   = poso ;
    }
    /*Set and Get*/
    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
    /*read for user input*/
    public void read(){
        Scanner input=new Scanner(System.in);
        System.out.println("Insert Item code:");
        itemCode = input.nextInt();
        System.out.println("Insert amount:");
        amount = input.nextInt();
    }
    /*toString*/
    public String toString()
    {
        return "\nItem code is:"+ itemCode+"    Amount is :"+ amount ;
    }
    /*Synartisi interface*/
    public float calculateAmount()
    {
        return (float) (amount+ amount*0.24);
    }
}
