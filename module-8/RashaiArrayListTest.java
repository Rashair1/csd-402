/* 
Rashai Robertson
CSD 402
7/6/20025
Module 8: Assignment 2
 */ 

// This program finds the maximum value from user input in an ArrayList.

// Reference: https://www.geeksforgeeks.org/java/finding-the-minimum-or-maximum-value-in-java-arraylist/



import java.util.ArrayList; // Import ArrayList to store integers
import java.util.Scanner; // Import Scanner to read user input


// Making the class
public class RashaiArrayListTest {

    // Method to find the maximum integer in the ArrayList
    public static Integer max(ArrayList list) {
       
       // If no numbers are added make the max 0
        if (list == null || list.isEmpty()) {
            return 0;
        }

        // ArrayList of numbers
        ArrayList<Integer> intList = (ArrayList<Integer>) list;
        Integer max = intList.get(0);

        // For loop to find the maximum value
        for (Integer num : intList) {
            if (num > max) {
                max = num;
            }
        }

        return max; // Return the maximum value found from user input
    }

    // Testing & printing
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Getting user input
        System.out.println("Welcome to Rashai's Max Value ArrayList Test!");
        System.out.println("You can enter numbers, and the program will find the largest one.");
        System.out.println("Enter any number (press 0 to stop which will include 0 in the list):");


        // While loop to continue until user inputs 0
        // Input validation with try/catch 
        // If only negative numbers are added the exit 0 will become the largest value
        while (true) {
            try {
                int input = Integer.parseInt(scanner.nextLine());
                numbers.add(input);
                if (input == 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        // Call the max method from the class
        Integer maxValue = max(numbers);

        // Print the largest value
        System.out.println("The largest number is: " + maxValue);
    }
}
