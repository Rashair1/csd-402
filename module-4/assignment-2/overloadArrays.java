/*
Rashai Robertson
CSD-402
6/15/2025
*/

// The purpose of this project is to overload four methods that return the average of an array.

//Reference: https://www.geeksforgeeks.org/java/array-class-in-java/


import java.util.Arrays;
import java.util.Scanner;
public class overloadArrays {
    
    //calculate the average for arrays of type short
    public static short average(short[] array) {
        if (array.length == 0) {
            return 0;
        }
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }
    //calculate the average for arrays of type int
    public static int average(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }
    //calculate the average for arrays of type long
    public static long average(long[] array) {
        if (array.length == 0) {
            return 0;
        }
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }
    //calculate the average for arrays of type double
    public static double average(double[] array) {
        if (array.length == 0) {
            return 0;
        }
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

        //call the function & print results
    public static void main(String[] args) {
        short[] shortArray = {1, 3, 5, 7, 9};
        int[] intArray = {10, 20, 15, 22, 35 };
        long[] longArray = {15L, 25L, 35L};
        double[] doubleArray = {1.3, 2.3, 7.3, 9.3};

        System.out.println("Short Array: " + Arrays.toString(shortArray));
        System.out.println("Average: " + average(shortArray));

        System.out.println("\nInt Array: " + Arrays.toString(intArray));
        System.out.println("Average: " + average(intArray));

        System.out.println("\nLong Array: " + Arrays.toString(longArray));
        System.out.println("Average: " + average(longArray));

        System.out.println("\nDouble Array: " + Arrays.toString(doubleArray));
        System.out.println("Average: " + average(doubleArray));
    }
}