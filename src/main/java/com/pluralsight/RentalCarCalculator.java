package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {

    //Scanner
    static final Scanner userInput = new Scanner(System.in);
    static final double tollTagPrice = 3.95;
    static final double gPSPrice = 2.95;
    static final double rSAPrice = 3.95;
    static final double basicCarRental = 29.99;
    static final double surCharge = 0.3;

    public static void main(String[] args) {

        //Known Variables
        String userText;

        System.out.print("Pickup Date: ");
        String pickUpDate = userInput.nextLine();

        System.out.print("Days for rent: ");
        int days = Integer.parseInt(userText = userInput.nextLine());

        System.out.printf("Electronic toll tag at $%.2f/day?\nY/N%n", tollTagPrice);
        String tollTag = userInput.nextLine();

        System.out.printf("GPS at $%.2f/day\nY/N%n", gPSPrice);
        String gPS = userInput.nextLine();

        System.out.printf("Roadside assistance at $%.2f/day\nY/N%n", rSAPrice);
        String rSA = userInput.nextLine();

        System.out.print("Age: ");
        int age = Integer.parseInt(userText = userInput.nextLine());

        pricing(basicCarRental, days, tollTag, gPS, rSA, age);

        //Scanner END
        userInput.close();
    }
    // TODO change into printfs
    public static void pricing(double bCRental, int days, String tollTag, String gPS, String rSA, int age) {
        double total = 0.0;
        System.out.println("--------Total Cost-------");
        double basicRentalCost = bCRental * days;
        total = total + basicRentalCost;
        System.out.println(basicRentalCost);
        if (tollTag.equals("Y")) {
            System.out.println(tollTagPrice * days + " Electronic toll tag charge");
            total = total + (tollTagPrice * days);
        }
        if (gPS.equals("Y")) {
            System.out.println(gPSPrice * days + " GPS charge");
            total = total + (gPSPrice * days);
        }
        if (rSA.equals("Y")) {
            System.out.println(rSAPrice * days + " Roadside assistance charge");
            total = total + (rSAPrice * days);
        }
        if (age < 25) {
            double sCMath = total * surCharge;
            System.out.printf("%.2f  Under 25 years of age surcharge%n", sCMath);
            total = total * (1 + surCharge);
        }
        System.out.println("--------------\n" + total);
    }
}

