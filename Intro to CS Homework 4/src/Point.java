// ************************************************************
// Point.java
//
// Contains instance data that represents a point on the
// Cartesian plane with coordinates (x,y), along with a method
// to return a String summary of the coordinates and the distance
// between two sets of coordinates.
// ************************************************************

public class Point {
    private int x, y;

    //-----------------------------------------------------------------
    // Constructor: Sets the initial x and y value.
    //-----------------------------------------------------------------
    public Point(int newX, int newY){
        x = newX;
        y = newY;
    }

    //-----------------------------------------------------------------
    // Returns a string representation of this point.
    //-----------------------------------------------------------------
    public String toString() {
        return "x:"+x+","+"y:"+y;
    }

    //-----------------------------------------------------------------
    // Returns the distance on the Cartesian plane between the point
    // calling the method and the point argument.
    //-----------------------------------------------------------------
    public double distance(Point other){
        return Math.sqrt(Math.pow(x-other.x,2)+Math.pow(y-other.y,2));
    }
}