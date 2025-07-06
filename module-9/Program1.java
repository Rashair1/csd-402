/* 
Rashai Robertson
CSD 402
7/6/20025
Module 9: Assignment 2
 */ 

// This program demonstrates the use of ArrayList to store game titles
// and allows the user to retrieve a title based on an index input.

// Reference: https://www.w3schools.com/java/java_arraylist.asp

import java.util.ArrayList; // Import ArrayList to hold game titles
import java.util.Scanner; // Import Scanner to read user input



// Making the class
public class Program1 {
    
    public static void main(String[] args) {
        
        // Create an ArrayList to hold String elements
        ArrayList<String> stringList = new ArrayList<>();
        
        // Fill with at least 10 strings
        stringList.add("0. GTA");
        stringList.add("1. Modern Warfare 2");
        stringList.add("2. Saints Row");
        stringList.add("3. Madden");
        stringList.add("4. 2k");
        stringList.add("5. Fortnite");
        stringList.add("6. Mariokart");
        stringList.add("7. Assasins Creed");
        stringList.add("8. Hitman");
        stringList.add("9. Gears of War");

        // Print the list
        System.out.println("Contents:");
        for (String games : stringList) {
            System.out.println(games);
        }
        // Prompt the user to enter a number to retrieve a game title
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nWhich game would you like to see again (pick a number 0-9): ");
        String userInput = scanner.nextLine();

        // Use try-catch to handle potential exceptions
        try {
            // Auto-Unboxing: Convert String input to Integer
            int index = Integer.parseInt(userInput); // Auto-unboxing from Integer to int
            // Try to access the element
            String selected = stringList.get(index);
            System.out.println("The game at index " + index + " is: " + selected);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter a number.");
        }

        scanner.close(); // Close the scanner
    }
}
