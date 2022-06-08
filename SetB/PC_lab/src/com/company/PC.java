package com.company;
import java.util.Scanner;

public class PC {

    private String	processor;
    private double frequency;
    private int RAM	;
    private double freeSpace ;
    private boolean operational;
    /*    Constructors */
    public PC(){
        processor= " " ;
        frequency=0.0;
        RAM= 0 ;
        freeSpace=0.0;
        operational= false;
    }
    public PC(String uprocessor,double ufrequency,int uRAM,double ufreeSpace,boolean uoperational ){
        processor = uprocessor;
        frequency = ufrequency;
        RAM =  uRAM;
        freeSpace = ufreeSpace;
        operational = uoperational;

    }
    /*    Methods     */
    public void read()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Give the details of the pc: ");

        System.out.println("Give the processor of the pc: ");
        this.processor = input.next();

        System.out.println("Give the frequency of the pc: ");
        this.frequency = input.nextDouble();

        System.out.println("Give the ram of the pc: ");
        this.RAM = input.nextInt();

        System.out.println("Give the freeSpace of the pc: ");
        this.freeSpace = input.nextDouble();

        System.out.println("Give the operational status of the pc: ");
        this.operational = input.nextBoolean();
    }

    public String getProcessor() {
        return processor;
    }
    public double getFrequency() {
        return  frequency;
    }
    public int getRAM() {
        return  RAM;
    }
    public double getFreeSpace() {
        return  freeSpace;
    }

    public boolean getOperational() {
        return  operational;
    }


    public void setProcessor(String processor) {
        this.processor = processor; }

    public void setFrequency(double frequency) {
        this.frequency = frequency; }

    public void setRAM(int RAM) {
        this.RAM = RAM; }

    public void setFreeSpace(double freeSpace) {
        this.freeSpace = freeSpace; }

    public void setOperational(boolean operational) {
        this.operational = operational; }

    //toString()
    public String toString() {
        return  "   Processor:   " + processor  +
                "   Frequency: " + frequency +
                "   RAM:   " + RAM +
                "   FreeSpace: " + freeSpace +
                "   Operational:   " + operational+"\n";
    }
}

