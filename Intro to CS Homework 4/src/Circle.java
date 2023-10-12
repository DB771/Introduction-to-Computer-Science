// ************************************************************
// Circle.java
//
// Contains the attributes center, a Point object, and radius,
// an int. Contains a default constructor and a getter and setter
// for each instance data as well as methods to check whether
// circles' radii are equal, to return a circle's circumference,
// and to represent a circle as a String.
// ************************************************************

public class Circle {
    private Point center;
    private int radius;

    //-----------------------------------------------------------------
    // Constructor: Sets the initial center and radius value.
    //-----------------------------------------------------------------
    public Circle(Point initCenter, int initRadius) {
        center = initCenter;
        radius = initRadius;
    }

    //-----------------------------------------------------------------
    // Center accessor/getter.
    //-----------------------------------------------------------------
    public Point getCenter() {
        return center;
    }

    //-----------------------------------------------------------------
    // Radius accessor/getter.
    //-----------------------------------------------------------------
    public int getRadius() {
        return radius;
    }

    //-----------------------------------------------------------------
    // Center mutator/setter.
    //-----------------------------------------------------------------
    public void setCenter(Point newCenter) {
        center = newCenter;
    }

    //-----------------------------------------------------------------
    // Radius mutator/setter.
    //-----------------------------------------------------------------
    public void setRadius(int newRadius) {
        radius = newRadius;
    }

    //-----------------------------------------------------------------
    // Returns a boolean depending on whether the radius of the
    // circle calling the method is equal to that of the argument.
    //-----------------------------------------------------------------
    public boolean equals(Circle otherCircle) {
        return radius == otherCircle.radius;
    }

    //-----------------------------------------------------------------
    // Returns the circumference of the circle.
    //-----------------------------------------------------------------
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    //-----------------------------------------------------------------
    // Returns a string representation of this circle.
    //-----------------------------------------------------------------
    public String toString() {
        return "The circle has a center at " + center.toString() +
                " and a radius at " + radius + ".";
    }
}
