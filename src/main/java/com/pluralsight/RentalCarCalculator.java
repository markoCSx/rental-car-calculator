package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {

    static final Scanner userInput = new Scanner(System.in);
    static final double tollTagPrice = 3.95;
    static final double gPSPrice = 2.95;
    static final double rSAPrice = 3.95;
    static final double basicCarRental = 29.99;
    static final double surCharge = 0.3;

    public static void main(String[] args) {

        //User Prompts
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

        //Method Call
        pricing(basicCarRental, days, tollTag, gPS, rSA, age);

        //Scanner END
        userInput.close();
    }
    // TODO change into printfs
    public static void pricing(double bCRental, int days, String tollTag, String gPS, String rSA, int age) {
        double total = 0.0;
        double printMath;

        System.out.println("--------Total Cost-------");

        double basicRentalCost = bCRental * days;
        System.out.println(String.format("%.2f Base rental cost", basicRentalCost));
        total = total + basicRentalCost;

        if (tollTag.equals("Y")) {
            printMath = tollTagPrice * days;
            System.out.printf("%.2f  Electronic toll tag charge%n", printMath);
            total = total + (tollTagPrice * days);
        }
        if (gPS.equals("Y")) {
            printMath = gPSPrice * days;

            //int randomMath = String.valueOf(printMath).length();
            //int randomMath2 = String.valueOf(basicRentalCost).length();

            System.out.printf("%.2f  GPS charge%n", printMath);
            total = total + (gPSPrice * days);
        }
        if (rSA.equals("Y")) {
            printMath = rSAPrice * days;
            System.out.printf("%.2f  Roadside assistance charge", printMath);
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

