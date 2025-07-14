/* 
Rashai Robertson
CSD 402
7/13/20025
Module 10: Assignment 
*/




// Creating the domesticDivision class
// This class extends the division class and adds a state attribute
public class domesticDivision extends division {
    private String state;

    

    public domesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        // //field for the state in which the division is located
        this.state = state;
    }
    // Overriding the display method to show domestic division details
    // It prints the division name, account number, and state
    @Override
    public void display() {
        System.out.println("Domestic Division:");
        System.out.println("Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println();
    }
}
