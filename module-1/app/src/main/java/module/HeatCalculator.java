/*
 Amanda New
 01/12/2025
 CSD402-A311
 M1: Programming Assignment
 Heat Water Calculator
 

This source file was generated by the Gradle 'init' task

Package for organization within code file */

package module;

/* Class */

public class HeatCalculator {

    /*Main method: where the program is executed from
     */

    public static void main(String [] args) {

        /* Scanner to read input from user */

        java.util.Scanner input = new java.util.Scanner(System.in);

        /* Gather input from user for water mass */

        System.out.println("Enter the amount of water in kilograms: ");

        /* Double used to allow for decimals (Found in chapter 4 of textbook) 
         * Used nextDouble to allow user to enter input on next line/enter is
         * used after prompt for cleaner style (also found in chapter 4 of textbook)
        */

        double waterMass = input.nextDouble();

        /* Gather input from user for initial temperature */

        System.out.println("Enter the initial temperature of the water in Celsius: ");
        double initialTemperature = input.nextDouble();

        /* Gather input from user for final temperature */

        System.out.println("Enter the final temperature of the water in Celsius: ");
        double finalTemperature = input.nextDouble();

        /* Equation in assignment instructions */

        double Q = waterMass * (finalTemperature - initialTemperature) * 4184;

        /* Result printed to include Joules */

        System.out.println("Energy needed to heat the water: " + Q + " Joules");

        /* Close input scanner */
        input.close();
    }

}