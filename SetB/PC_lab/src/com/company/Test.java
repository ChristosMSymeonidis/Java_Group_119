package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        // write your code here
        Lab pcergastiriou = new Lab();

        pcergastiriou.addComputer(new PC("Intel Core i3-12300", 2.3, 8, 32.3, true));
        pcergastiriou.addComputer(new PC("Intel Core i5-12600 ", 3.3, 16, 523, true));
        pcergastiriou.addComputer(new PC("AMD Ryzen 5 3600  ", 3.6, 4, 10, true));
        pcergastiriou.addComputer(new PC("AMD Ryzen 7 5750   ", 3.8, 16, 410, true));

        System.out.println("Ektypwste ton arithmo pc pou leitourgoun kanonika");
        System.out.println(pcergastiriou.workingPCs());

        System.out.println("Prospathiste na egkatastisete mia efarmogi 3 GB ");
        pcergastiriou.installApp(3.0f);
        pcergastiriou.pcStatus(0, false);

        System.out.println(pcergastiriou.toString());
        // System.out.println(pcergastiriou);
        if(pcergastiriou.checkSpecs(2.8f, 12, 15.3f))
        {
            System.out.println("All PCs can run the app");
        }
        else
        {
            System.out.println("Not all PCs can run the app");
        }

    }
}
