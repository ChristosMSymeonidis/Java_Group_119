package com.company;
import java.util.Scanner;

public class Accounttest{
    public static void main(String[] args) {
       
	   Account[] logariasmos = new Account[5] ; // dilwsi pinaka twn  5 antikeimenwn tis classis account

		// klisi constructor me orismata gia arxikopoihsi twn 5 antikeimenwn 
        logariasmos[0]= new Account("Xristos",0);//AccNumber=1
        logariasmos[1]= new Account("Giorgos",0);//AccNumber=2
        logariasmos[2]= new Account("Fwtis",0);//AccNumber=3
        logariasmos[3]= new Account("Nikos",0);//AccNumber=4
        logariasmos[4]= new Account("Kostas",0);//AccNumber=5
        int action,arithmoslogariasmou;
        Scanner input = new Scanner( System.in );
        do{// domi epanalipsis gia tin synallagi
            System.out.println("Epilexte tin energeia sas : \n1:Katathesi \n2:Analipsi \n3:Agora me xrewstiki \n4:Analipsi epagelmatia \n5:Emfanisi stoxeiwn lgoariasmou \n6:Emfanisi logariasmou me megalytero  balance \n7:Exodos"); // apo ena ws 7 na grafoun ta actions
            action = input.nextInt();

            while(action<1 || action>7){// elegxos egkyris eisodou action
                System.out.println("Akyri praksi parakalw eisagete arithmo apo 1 ews 7");
                action = input.nextInt();
            }

            switch (action) {
                case 1:// deposit
                    System.out.println("Eisagete ton arithmo tou  logariasmou  gia tin katathesi (  1 2 3 4 5 ) ");
                    arithmoslogariasmou = input.nextInt();
                    while(arithmoslogariasmou<1 || arithmoslogariasmou>5){
                        System.out.println("Den yparxei, parakalw eisagete arithmo apo 1 ews 5");
                        arithmoslogariasmou = input.nextInt();
                    }
                    System.out.println("Eisagete to poso pou thelete na katathesete ston "+logariasmos[arithmoslogariasmou-1].getName() );
                    logariasmos[arithmoslogariasmou-1].deposit(input.nextDouble());
                    break;
                case 2:// withdraw
                    System.out.println("Eisagete ton arithmo tou  logariasmou gia tin analipsi(  1 2 3 4 5 ) ");
                    arithmoslogariasmou = input.nextInt();
                    while(arithmoslogariasmou<1 || arithmoslogariasmou>5){
                        System.out.println("Den yparxei ,parakalw eisagete arithmo apo 1 ews 5");
                        arithmoslogariasmou = input.nextInt();
                    }
                    System.out.println("Eisagete to poso pou thelete na kanete analipsi ");
                    logariasmos[arithmoslogariasmou-1].withdraw(input.nextDouble());
                    break;
                case 3:// cardpurchase
                    System.out.println("Eisagete ton arithmo tou  logariasmou gia tin agora me pistwriki (  1 2 3 4 5 ) ");
                    arithmoslogariasmou = input.nextInt();
                    while(arithmoslogariasmou<1 || arithmoslogariasmou>5){
                        System.out.println("Den yparxei, parakalw eisagete arithmo apo 1 ews 5");
                        arithmoslogariasmou = input.nextInt();
                    }
                    System.out.println("Eisagete to poso tis agoras me tin pistwtiki ");
                    logariasmos[arithmoslogariasmou-1].cardPurchase(input.nextDouble());
                    break;
                case 4:// withdraw blocked
                    System.out.println("Eisagete ton arithmo tou  logariasmou gia analipsi apo ta desmeumena (  1 2 3 4 5 ) ");
                    arithmoslogariasmou = input.nextInt();
                    while(arithmoslogariasmou<1 || arithmoslogariasmou>5){
                        System.out.println("Den yparxei, parakalw eisagete arithmo apo 1 ews 5");
                        arithmoslogariasmou = input.nextInt();
                    }
                    System.out.println("Eisagete to poso analipsis apo ta desmeumena ");
                    logariasmos[arithmoslogariasmou-1].withdrawBlockedAmount(input.nextDouble());
                    break;
                case 5:// emfanisi stoixeiwn gia epilegmeno logariasmo
                    System.out.println("Eisagete ton arithmo tou  logariasmou gia emfanisi (  1 2 3 4 5 ) ");
                    arithmoslogariasmou = input.nextInt();
                    while(arithmoslogariasmou<1 || arithmoslogariasmou>5){
                        System.out.println("Den yparxei ,parakalw eisagete arithmo apo 1 ews 5");
                        arithmoslogariasmou = input.nextInt();
                    }
                    logariasmos[arithmoslogariasmou-1].print();
                    break;
                case 6:// emfanisi stoixeiwn lgoariasmou me to megalytero ypoloipo
					int deiktismaxbalance =0;
                    double max = logariasmos[0].getBalance();
                    for(int i=0;i<5;i++){
                        if(logariasmos[i].getBalance()>max) {
                            deiktismaxbalance = i ;
                        }
                    }
                    System.out.println("Ta stoixeia tou logariasmou me to megalytero ypoloipo einai: ");
                    logariasmos[deiktismaxbalance].print();
                    break;
                case 7:// exit
                    System.out.println("Epilexate exodo ,antio");
                    break;
            }
        }while(action !=7 );
    }
}