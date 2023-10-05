// ************************************************************
// TestMethods.java
//
// Invokes the methods in MyMethods with test data.
// ************************************************************

public class TestMethods {
    public static void main(String[] args) {
        MyMethods myMethods = new MyMethods(); // Creates instance of MyMethods

        // Uses .volume() method for 3 values
        double volumeBox = myMethods.volume(4.0, 5.5, 7.9);
        System.out.println("The volume of the rectangular box is " + volumeBox + " units^3");

        // Creates two objects of class Die and uses .roll() method
        Die die1 = new Die();
        die1.roll();
        Die die2 = new Die();
        die2.roll();

        // Uses the avgFaceValues method with two Die objects
        double avgFaceValuesDice = myMethods.avgFaceValues(die1, die2);
        System.out.println("The average face value of the two dice is " + avgFaceValuesDice);
    }
}
