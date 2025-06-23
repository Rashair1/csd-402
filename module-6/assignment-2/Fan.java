/* 
Rashai Robertson
CSD 402
6/22/20025
Module 6: Assignment 2
 */ 

//The purpose of this program is to make a Fan class and determine wheter it's on or off as well as the speed and color.

//References 1. Introduction to Java Programming and Data Structures Chapter 9 section 8. 2.https://www.youtube.com/watch?time_continue=62&v=jwtXSY8ZL5k&embeds_referring_euri=https%3A%2F%2Fwww.bing.com%2F&embeds_referring_origin=https%3A%2F%2Fwww.bing.com&source_ve_path=MjM4NTE

public class Fan {

    // Four Constants with 0-3
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed = STOPPED;
    private boolean on;
    private double radius;
    private String color;

    // Setter and getter methods for mutable fields
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= STOPPED && speed <= FAST) {
            this.speed = speed;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null) {
            this.color = color;
        }
    }

    // No argument constructor with defaults
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    // Argument constructor that sets values
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    

    // The toString method that describes Fans state
    public String toString() {
        if (on) {
            return "Fan On: " + "Speed = " + speedToString(speed) + ", Radius = " + radius + ", Color = " + color;
        } else {
            return "Fan OFF: " + "Radius = " + radius + ", Color = " + color;
        }
    }

    // Converting the speed to text fix
    private String speedToString(int speed) {
        switch (speed) {
            case SLOW: return "SLOW";
            case MEDIUM: return "MEDIUM";
            case FAST: return "FAST";
            case STOPPED: return "STOPPED";
            default: return "UNKNOWN";
        }
    }

    // Testing the Fan class using two instances.
    public static void main(String[] args) {
        // Using the default constructor
        Fan fan1 = new Fan();
        System.out.println("Fan 1: " + fan1);

        // Using the argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10.0, "red");
        System.out.println("Fan 2: " + fan2);

        // Example of functionality
        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setColor("green");
        fan1.setRadius(8.5);
        System.out.println("Example functionality of the Fan Class methods: " + "Fan 1: "+ fan1 + "Fan 2: " + fan2);
    }
}
