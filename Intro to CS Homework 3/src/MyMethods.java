// ************************************************************
// MyMethods.java
//
// Contains 2 methods, one of which accepts 3 double parameters
// named width, length, and height and returns the corresponding
// volume. The second takes 2 die objects as parameters and returns
// their average face value.
// ************************************************************

public class MyMethods {
    public double volume(double width, double length, double height) {
        double volume = width * length * height; // Calculates the volume of the rectangular prism
        return volume;
    }

    public double avgFaceValues(Die die1, Die die2) {
        // Calculates average face value of two objects of class Die
        double average = (die1.getFaceValue() + die2.getFaceValue()) / 2.0;
        return average;
    }
}
