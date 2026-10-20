package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {

    //Scanner
    static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        //Known Variables
        String userText;
        double tollTagPrice = 3.95;
        double gPSPrice = 2.95;
        double rSAPrice = 3.95;

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

        //Scanner END
        userInput.close();
    }

}

