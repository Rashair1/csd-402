/* 
Rashai Robertson
CSD 402
6/1/20025
Module 1: Assignment 3
 */ 

/*This program calculates the energy needed to heat water from an initial temperature to a final temperature */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Getting user input for the amount of water in kilograms
        System.out.print("Using kilograms, enter the amount of water: ");
        double waterMass = input.nextDouble();

        // Getting user input for the initial temperature
        System.out.print("What is the initial temperature in Celsius?: ");
        double initialTemperature = input.nextDouble();

        // Getting user input for the final temperature
        System.out.print("What is the final temperature in Celsius?: ");
        double finalTemperature = input.nextDouble();

        // Calculating the energy needed using the formula given.
        double energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Print the results
        System.out.printf("The energy needed to heat the water is %.2f joules.%n", energy);

        // Close the scanner
        input.close();
    }
}