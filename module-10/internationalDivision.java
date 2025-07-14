

/* 
Rashai Robertson
CSD 402
7/13/20025
Module 10: Assignment 
*/


//creating the internationalDivision class that extends the division class and adds country and language attributes
public class internationalDivision extends division {
    private String country;
    private String language;


    // Constructor to initialize the internationalDivision attributes
    public internationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }
    // Overriding the display method to show international division details
    //Printing the division name, account number, country, and language
    @Override
    public void display() {
        System.out.println("International Division:");
        System.out.println("Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
    }
}
