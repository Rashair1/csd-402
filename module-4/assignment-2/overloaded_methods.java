/* 
Rashai Robertson
CSD 402
6/8/20025
Module 3: Assignment 2
 */ 

 //The purpose of this program is to make a pyramid of numbers that double then reverse for 7 rows. Adding @ at the End verically

 //Reference used: https://www.geeksforgeeks.org/method-overloading-in-java/



 // Java program to demonstrate working of method
// overloading in Java
public class overloaded_methods {
    
    // Overloaded sum() 
    // This sum takes two int parameters
    public static short average (short [ ] array)




    // Overloaded sum()
    // This sum takes three int parameters
    public static int average (int [ ] array)
    

    // Overloaded sum() 
    // This sum takes two double parameters
    public static long average (long [ ] array)




    public static double average (double [ ] array)

    // Driver code
    public static void main(String args[])
    {
        Sum s = new Sum();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(10.5, 20.5));
    }
}
