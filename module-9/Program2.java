/* 
Rashai Robertson
CSD 402
7/6/20025
Module 9: Assignment 2
 */ 

// This program demonstrates file handling in Java by creating a file and writing random integers to it. 
// It also reads the file and displays its contents.

// Reference: https://www.w3schools.com/java/java_files_create.asp


import java.io.*; // Import File, FileWriter, BufferedWriter for file operations
import java.util.Random; // Import Random to generate random integers
import java.util.Scanner; // Import Scanner to read from the file


// Making the class 
public class Program2 {

    // Initialize Random object to generate random integers
    public static void main(String[] args) {
        File file = new File("data.file");
        Random rand = new Random();
        
        // Check if the file exists using try/catch if/else.
        // If it doesn't exist, create it and write random integers to it.
        try {
            // Create it if it doesn't exist
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File created: " + file.getName());


                // The file exists already so append
            } else {
                System.out.println("The file already exists. We're appending the data");
            }

            // To append data to the file if it was already created
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);

            // Writing 10 random integers
            for (int i = 0; i < 10; i++) {
                int number = rand.nextInt(100); // 0-99
                bw.write(number + " "); // Write the random number to the file & add space
            }

            bw.newLine(); // New line so it only shows 10 integers per line
            bw.close(); // Closing the writing function
            fw.close(); // Closing the file 

            // Read and display the file 
            Scanner reader = new Scanner(file);
            System.out.println("\ndata.file contents:");
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }

            reader.close(); // Closing the reader
 
            // Handle exceptions related to file operations
        } catch (IOException e) {
           
            System.out.println("Sorry. An error has occurred.");
            e.printStackTrace();
        }     
    }
}
