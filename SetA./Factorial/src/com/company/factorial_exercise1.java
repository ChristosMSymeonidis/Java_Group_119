package com.company;
import java.util.Scanner; // import the Scanner class

public class factorial_exercise1 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    int  n;
	int i;
	int factorial=1;
	int athroisma_psifiwn =0;
	do {
		System.out.println("Enter positive n");
		n = myObj.nextInt();
	}while(n<0);// elegxos gia thetiko akeraio
    for(i=1;i<=n;i++) {
          factorial*= i;// ypologismos paragontikou
      }
	System.out.println("Factorial of "+ n + " is: " + factorial);   
	while(factorial>0){
		   athroisma_psifiwn+=factorial%10;// %10krataei to teleutaio psifio tou paragontikou += prosthetei to psifio sto athroisma 
		   factorial = factorial/10;// katevazei mia taksi megethous to paragontiko wste stin epomeni ektelesei na tsimpisei to kainourgio teleutaio psifio
		 }
	System.out.println("The sum of its digits is : "+ athroisma_psifiwn );
	//Scanner.close();    
	}
}