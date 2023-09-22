import java.util.Scanner; // Import Scanner object

// ************************************************************
// Circle.java
//
// Print the area and circumference of a circle with two different radii
// ************************************************************
public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Create a Scanner object

        final double PI = 3.14159;
        int radius;

        System.out.println("Please enter a value for the radius.");
        radius = scan.nextInt(); // read statement

        double area1 = PI * radius * radius; // Follows area formula: A = pi(r)^2
        double circumference1 = 2 * PI * radius; // Follows circumference formula: C = 2(pi)(r)

        System.out.println("The area of a circle with radius " + radius +
                " is " + area1);
        System.out.println("The circumference of a circle with radius " +
                radius + " is " + circumference1);

        radius *= 2; // radius becomes double of its original value

        double area2 = PI * radius * radius; // New area according to doubled radius
        double circumference2 = 2 * PI * radius; // New circumference according to doubled radius

        System.out.println("The area of a circle with radius " + radius +
                " is " + area2);
        System.out.println("The circumference of a circle with radius " +
                radius + " is " + circumference2);

        double areaChange = area2 / area1; // calculates ratio of area values
        System.out.println("The factor by which the area" +
                " grew is " + areaChange);

        double circumferenceChange = circumference2 / circumference1; // calculates ratio of circumference values
        System.out.println("The factor by which the circumference" +
                " grew is " + circumferenceChange);

        // For all cases, when the radius doubles, the area increases by a factor of 4,
        // quadrupling its original value. And for all cases, when the radius doubles, the
        // circumference increases by a factor of 2, doubling its original value.

    }
}