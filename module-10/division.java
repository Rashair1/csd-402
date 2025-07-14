
/* 
Rashai Robertson
CSD 402
7/13/20025
Module 10: Assignment 
*/





//Creating the division class
public abstract class division {
    protected String divisionName;
    protected int accountNumber;
    
    // Constructor to company's division name and account number
    public division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    //Display () method that will be defined in the subclasses
    public abstract void display();
}
