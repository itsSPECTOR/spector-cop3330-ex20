
package org.example;
import java.util.Scanner;

/**
 *
 * UCF COP3330 Fall 2021 Assignment 20 Solution
 * Copyright 2021 Reese Spector
 *
 */

public class App {

    static double WI = 0.05;
    static double IL = 0.08;

    public static void main(String[] args) {

        // scanner
        Scanner input = new Scanner(System.in);

        double order = 0, mainTax = 0, extraTax = 0, total = 0, totalTax = 0;

        //get inputs
        System.out.print("What is the order amount? ");
            String strOrder = input.nextLine();
            order = Double.parseDouble(strOrder);
        System.out.print("What state do you live in? ");
            String strState = input.nextLine();
        System.out.print("What county do you live in? ");
            String strCounty = input.nextLine();

        switch (strState){
            case "Wisconsin":
                if(strCounty.contains("Eau Claire")){ extraTax = 0.005; }
                if(strCounty.contains("Dunn")){ extraTax = 0.004; }
                mainTax = 0.05 + extraTax;
                break;
            case "Illinois":
                mainTax = 0.08;
                break;
            default: break;
        }

        //math + round
        total = order + (order * mainTax);
        total = (double) Math.round(total *  100.0) / 100.0;
        totalTax = order * mainTax;
        totalTax = Math.round(totalTax * 100.0) / 100.0;

        //output
        System.out.print(
                "The tax is $" + totalTax + "." +
                "The total is $" + total + "."
        );

    }
}