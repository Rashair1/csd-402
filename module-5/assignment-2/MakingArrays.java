/* 
Rashai Robertson
CSD 402
6/22/20025
Module 5: Assignment 2
 */ 



 //The purpose of this program is to returns the location of the largest and smallest element in an array that's one-dimensional and contains two location elements.

 //Reference: https://www.geeksforgeeks.org/java/java-program-for-program-to-find-largest-element-in-an-array/
import java.util.Arrays;
import java.util.Scanner;

//making the class
public class MakingArrays {

    // Locate largest array
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = new int[2];
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    // Locate largest in int array
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = new int[2];
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    // Locate smallest in double array
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = new int[2];
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    // Locate smallest in int array
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = new int[2];
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    // Printing & testing the program
    public static void main(String[] args) {
        double[][] doubleArray = {
            {1.2, 3.4, 5.6},
            {7.8, 0.1, 2.3}
        };

        int[][] intArray = {
            {10, 25, 3},
            {5, 30, 7}
        };
        //largest element returning a one-dimensional array that contains two location elements
        int[] maxDoubleLoc = locateLargest(doubleArray);
        int[] maxIntLoc = locateLargest(intArray);
        System.out.println("Largest element double: [" + maxDoubleLoc[0] + "][" + maxDoubleLoc[1] + "]");
        System.out.println("Largest element int: [" + maxIntLoc[0] + "][" + maxIntLoc[1] + "]");
        
        
        //smallest element returning a one-dimensional array that contains two location elements.
        int[] minDoubleLoc = locateSmallest(doubleArray);
        int[] minIntLoc = locateSmallest(intArray);
        System.out.println("Smallest element double: [" + minDoubleLoc[0] + "][" + minDoubleLoc[1] + "]");
        System.out.println("Smallest element int: [" + minIntLoc[0] + "][" + minIntLoc[1] + "]");
    }
}











