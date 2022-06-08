package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Sales
{   /*Fields*/
    private String company;
    private String day; //  ΗΗ/ΜΜ/ΕΕΕΕ elegxos ?
    private ArrayList<Purchase> purchases ;
    /*Constructor*/
    public Sales(){
        company = " ";
        this.purchases = new ArrayList<>();
            }
    /*Set and Get*/
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public ArrayList<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases( Purchase purchases) {
        this.purchases.add(purchases);
    }

    public void readSales()    {   String type;
        Scanner input = new Scanner(System.in);
        System.out.println("Insert date , first date then month and finally year without spaces");
        day= input.nextLine();


        OnlinePurchase Online = new OnlinePurchase();
        ShopPurchase Shop = new ShopPurchase();
        System.out.println("What type is your sale? For OnlinePurchase insert o and for ShopPurchase insert S");
        type= input.nextLine();
        if(type == "s")
        {
            Shop.read();
            purchases.add(Shop);
        }
        if(type == "o")
        {
            Online.read();
            purchases.add(Online);
        }


    }
    /*toString*/
    public String toString()    {
        return "\nDate"+ day +" Company  :"+ company + "\n";
    }
    /*Synartish ypologismou*/
    public float calculateRevenue()     {
        float revenue=0;
        for(int i=0 ; i< getPurchases().size();i++) {
            revenue += purchases.get(i).calculateAmount();
        }
        System.out.println(purchases.toString());
        System.out.println("Revenew amounts to :");
        return revenue;
    }
    /*Synartiseis euresis diaforwn stoixein gia tis agores*/
    public void findMaxSale()    {   float max = purchases.get(0).calculateAmount();
        /*
        Xrisimopoiw to index gia na sygkrinw tis poliseis kathe proiontos kai na vrw to max
        */
        int index = 0;
        for(int i=0 ; i< getPurchases().size();i++) {
            if(purchases.get(i).calculateAmount()>max)
            max = purchases.get(i).calculateAmount();
            index = i ;
        }
        System.out.println("\nItem which sold the most is");
        System.out.println(purchases.get(index).toString());
    }

    public void Comparison()    {
        float Shoprevenue=0.0f , Onlinerevenue=0.0f;
        String foros = "foros",voithos="Voithos";
        for(int i=0 ; i< getPurchases().size();i++) {
            if (purchases.contains(voithos) ) { Shoprevenue += purchases.get(i).calculateAmount();   }
            if (purchases.contains(foros) ) { Onlinerevenue += purchases.get(i).calculateAmount(); }
        }
    }// Unfinished

    public void FindSales() {
        float revenue_of_certain_item_code=0.0f;
        /*
        O programmer thetei timi sto iC se autin tin synartisi kai i synartisi anazitaei
        poses fores to sygkekrimeno iC polithike kai posa kerdi apefere
        */
        int kwdikos=4,iC_counter=0;
        for(int i=3 ; i< getPurchases().size();i++) {
            if (purchases.get(i).getItemCode()== kwdikos)
            { revenue_of_certain_item_code += purchases.get(i).calculateAmount();
              iC_counter ++;
            }
        }
        System.out.println("\nTo proion "+kwdikos+" pwlithike "+iC_counter+" fores" );
        System.out.println("Apefere "+revenue_of_certain_item_code+" kerdi ");
    }

}