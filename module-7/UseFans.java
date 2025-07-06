/* 
Rashai Robertson
CSD 402
6/29/20025
Module 7: Assignment 2
 */ 

/*The purpose of this program is to create the following new class titled UseFans:
Create a collection of Fan instances.
Create a method taking a collection of Fan instances for displaying without using the toString() method.
Create a method that takes a single instance of a Fan for displaying without using the toString() method.
Use the ‘this’ reference throughout the Fan class where allowed.
Write test code that creates a collection of Fans and displays the functionality of all the Fan instances in the collection.
//References 1. Introduction to Java Programming and Data Structures Chapter 10. https://www.youtube.com/watch?time_continue=62&v=jwtXSY8ZL5k&embeds_referring_euri=https%3A%2F%2Fwww.bing.com%2F&embeds_referring_origin=https%3A%2F%2Fwww.bing.com&source_ve_path=MjM4NTE
*/



public class UseFans {

    // method taking a collection of Fan instances
    public void displayFanArray(Fan[] fans) {
        for (int i = 0; i < fans.length; i++) {
            System.out.println("Fan #" + (i + 1) + ":");
            displayFan(fans[i]);
            System.out.println(); 
            
        }
    }

    // method that takes a single instance of a Fan 
    public void displayFan(Fan fan) {
        if (fan.isOn()) {
            System.out.println("Fan speed: " + fan.getSpeed() + ", color: " + fan.getColor() + ", radius: " + fan.getRadius());
        } else {
            System.out.println("Fan is off, color: " + fan.getColor() + ", radius: " + fan.getRadius());
        }
    }

   //collection of Fans and displays the functionality of all the Fan instances in the collection
    public static void main(String[] args) {
        // Create a collection of Fan instances.
        Fan[] fans = new Fan[3];
        fans[0] = new Fan(Fan.FAST, false, 1, "yellow");
        fans[1] = new Fan(Fan.STOPPED, false, 2, "white");
        fans[2] = new Fan(Fan.SLOW, true, 10, "red");

        // Create an instance of UseFans
        UseFans useFans = new UseFans();

        // Display the functionality of each Fan
        System.out.println("Fans:");
        System.out.println();
        useFans.displayFanArray(fans);
    }
}

