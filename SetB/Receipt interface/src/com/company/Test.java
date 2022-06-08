package com.company;

public class Test {

    public static void main(String[] args) {
	// write your code here
        /*Eisagwgi pwlisewn */
        Sales pwliseis = new Sales();
        pwliseis.setPurchases(new OnlinePurchase(10f,"Kozani",0,1000f));
        pwliseis.setPurchases(new OnlinePurchase(10f,"Veroia",1,500f));
        pwliseis.setPurchases(new ShopPurchase(13,"Karolou",2,100f));
        pwliseis.setPurchases(new ShopPurchase(7,"Serafen",4,1050f));
        /*Ektypwsi  revenue */
        System.out.println(pwliseis.calculateRevenue());
        /*Klisi synartisewn  euresis diaforwn stoixein gia tis agores */
        pwliseis.findMaxSale();
        //  pwliseis.Comparison();   Not completed
        pwliseis.FindSales();
    }
}
