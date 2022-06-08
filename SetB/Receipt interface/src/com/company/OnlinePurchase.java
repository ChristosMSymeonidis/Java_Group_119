package com.company;
import java.util.Scanner;

public class OnlinePurchase extends Purchase
{   /*Fields*/
    private String address;
    private float shippingCost;
    /*Constructors*/
    public OnlinePurchase(){
        super();
        address="";
        shippingCost=0;
    }

    public OnlinePurchase(float sCost,String diefthinsi,int iC, float poso ) {
        super(iC,poso);
        address = diefthinsi;
        shippingCost=sCost;
    }
    /*Set and Get*/
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(float shippingCost) {
        this.shippingCost = shippingCost;
    }
    /*read for user input*/
    public void  read()    {
        super.read();
        Scanner input=new Scanner(System.in);
        System.out.println("Insert adress:");
        address = input.next();
        System.out.println("Insert shippingCost:");
        shippingCost = input.nextFloat();
    }
    /*toString*/
    public String toString()
    {
        return super.toString()  +" Adress:"+address+"   ShippingCost:"+shippingCost;
    }
    /*Synartisi interface*/
    public float calculateAmount()    {
        return (float) ( getAmount()+  shippingCost+( getAmount()+shippingCost)*0.13);
    }
}
