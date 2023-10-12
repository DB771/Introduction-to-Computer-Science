// ************************************************************
// CircleTest.java
//
// Instantiates two Point objects, takes in an int for a radius,
// and initializes another radius int. This then is used to
// instantiate two Circle objects, to which the toString() method
// from Circle.java is called. From the same file, depending on
// if the circles' radii are equal, either the distance or average
// circumference of the two are called and printed.
// ************************************************************

import java.util.Scanner; // Import the Scanner class
import java.util.Random; // Import the Random class

public class CircleTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Create a Scanner object
        Random generator = new Random(); // Create a Random object

        // Create two Point objects, one with (x,y) from 1 to 25 and another at (0,0)
        Point point1 = new Point((generator.nextInt(25) + 1), (generator.nextInt(25) + 1));
        Point point2 = new Point(0, 0);

        // Allows user to input radius for first circle and initializes the other
        System.out.print("Enter the radius for first circle: ");
        int radius1 = input.nextInt();
        int radius2 = 5;

        // Create two Circle objects
        Circle circle1 = new Circle(point1, radius1);
        Circle circle2 = new Circle(point2, radius2);

        // Call and print toString methods of both Circle objects
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());

        // Return distance between Circle objects' points if their radii are equal
        if (circle1.equals(circle2)) {
            double distance = circle1.getCenter().distance(circle2.getCenter());
            System.out.println("The distance between the circles' centers is " + distance);
        } // Return average circumference if radii are not equal
        else {
            System.out.println("The average circumference of the circles is " +
                    ((circle1.circumference() + circle2.circumference()) / 2));
        }
    }
}
