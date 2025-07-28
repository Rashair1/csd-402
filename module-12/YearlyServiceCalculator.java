/* 
Rashai Robertson
CSD 402
7/27/2025
Module 12: Assignment 2
 */ 

 // This program uses four methods to calculate the cost of yearly auto service based on certain factors.
 //Then it tests them twice with a main method

// Reference: https://www.w3schools.com/java/java_methods_param.asp


public class YearlyServiceCalculator {

    // Standard service charge
    private static final double STANDARD_SERVICE_CHARGE = 150.99;
    // Oil change fee price
    private static final double OIL_CHANGE_FEE = 37.00;
    // Tire rotation fee price
    private static final double TIRE_ROTATION_CHARGE = 40.00;

    // No parameter service 
    public static double yearlyService() {
        return STANDARD_SERVICE_CHARGE;
    }

   // One parameter service plus oil change
    public static double yearlyService(double oilChangePlaceholder) {
        return STANDARD_SERVICE_CHARGE + OIL_CHANGE_FEE;
    }

    // Two parameter plus oil change and tire rotation
    public static double yearlyService(double oilChangePlaceholder, double tireRotationPlaceholder) {
        return STANDARD_SERVICE_CHARGE + OIL_CHANGE_FEE + TIRE_ROTATION_CHARGE;
    }

    // Three parameter plus oil change, tire rotation, and coupon
    public static double yearlyService(double oilChangePlaceholder, double tireRotationPlaceholder, double couponAmount) {
        return STANDARD_SERVICE_CHARGE + OIL_CHANGE_FEE + TIRE_ROTATION_CHARGE - couponAmount;
    }



    // Testing each method twice
    public static void main(String[] args) {
        System.out.println("Standard service:");
        System.out.println("Service cost: $" + String.format("%.2f", yearlyService()));
        System.out.println("Service cost: $" + String.format("%.2f", yearlyService()));
        System.out.println();

        System.out.println("Standard service and oil change:");
        System.out.println("Service cost with oil change: $" + String.format("%.2f", yearlyService(0.0))); // Parameter value doesn't matter for calculation
        System.out.println("Service cost with oil change: $" + String.format("%.2f", yearlyService(1.0)));
        System.out.println();

        System.out.println("Standard service, oil change, and tire rotation:");
        System.out.println("Service cost with oil change and tire rotation: $" + String.format("%.2f", yearlyService(0.0, 0.0)));
        System.out.println("Service cost with oil change and tire rotation: $" + String.format("%.2f", yearlyService(1.0, 1.0)));
        System.out.println();

        System.out.println("Standard service, oil change, tire rotation, and coupon:");
        System.out.println("Service cost with coupon ($15 off): $" + String.format("%.2f", yearlyService(0.0, 0.0, 15.00)));
        System.out.println("Service cost with coupon ($35 off): $" + String.format("%.2f", yearlyService(1.0, 1.0, 35.00)));
        System.out.println();
    }
}
