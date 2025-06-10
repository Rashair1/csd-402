/* 
Rashai Robertson
CSD 402
6/8/20025
Module 3: Assignment 2
 */ 

 //The purpose of this program is to make a pyramid of numbers that double then reverse for 7 rows. Adding @ at the End verically

 //Reference used: https://www.geeksforgeeks.org/programs-printing-pyramid-patterns-java/


public class nested_loops {
    public static void main(String[] args) {
        //Making 7 rows
        int rows = 7; 
        char symbol = '@'; // Symbol for the end of each line
        
        // outer loop to handle number of rows
        for (int i = 0; i < rows; i++) {
            
            // inner loop to handle number spaces
            for (int num = 0; num < rows - i - 1; num++) {
                //add spaces to correctly line up the numbers for a pyrimid
                System.out.print("   ");
            }

            // starting the count to handle number of columns
            for (int num = 1; num <= Math.pow(2, i); num *= 2) {
                System.out.printf("%-3d", num);
            }

            // start reverse order
            for (int num = (int) Math.pow(2, i - 1); num >= 1; num /= 2) {
                System.out.printf("%-3d", num);
            }

            //trying to add @ vertically
            if (rows == 7) {
                System.out.print("\t" + symbol);
            }     
            
            //Making a new line after each row to create a pyramid effect. 
            System.out.println( "");
        }

    }
}