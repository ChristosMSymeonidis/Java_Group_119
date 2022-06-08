package com.company;

import java.util.Scanner;

public class ShopPurchase extends Purchase
{   /*Fields*/
    private String assistant;
    private int tax;
    /*Constructors*/
    public ShopPurchase(){
        super();
        assistant="";
        tax=0;
    }

    public ShopPurchase(int foros,String voithos,int iC, float poso )    {
        super(iC,poso);
        tax = foros;
        assistant=voithos;
    }
    /*Set and Get*/
    public String getAssistant() {
        return assistant;
    }

    public void setAssistant(String assistant) {
        this.assistant = assistant;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public void read()    {
        super.read();
        Scanner input = new Scanner(System.in);
        System.out.println("Give tax");
        tax= input.nextInt();
        System.out.println("Give assistant name ");
        assistant=input.next();
    }
    /*toString*/
    public String toString() {
        return super.toString()+" Tax: "+tax+"%   Assistant name:"+assistant;
    }
    /*Synartisi interface*/
    public float calculateAmount()
    {
        return   getAmount() +  getAmount()*tax ;
    }
}

