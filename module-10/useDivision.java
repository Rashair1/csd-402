/* 
Rashai Robertson
CSD 402
7/13/20025
Module 10: Assignment 
*/


// Running the division classes
 
public class useDivision {
    public static void main(String[] args) {
        
        //Creating four instances
        internationalDivision intl1 = new internationalDivision("Malasyia", 404, "Malasyia", "Malay");
        internationalDivision intl2 = new internationalDivision("Tokyo", 604, "Japan", "Japanese");

        domesticDivision dom1 = new domesticDivision("Philly", 1997, "Pennsylvania");
        domesticDivision dom2 = new domesticDivision("Seattle", 2002, "Washington");

        //Displaying the details of each division
        intl1.display();
        intl2.display();
        dom1.display();
        dom2.display();
    }
}
