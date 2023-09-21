import java.util.Scanner;  // Imports the Scanner class

public class Problem2 {
    // -----------------------------------
    // main method --
    // Takes in a number of seconds from the user and outputs the greatest number of hours, the greatest
    // number of minutes, and the remaining number of seconds from the original value inputted. Rounds number
    // of seconds to 4 decimal places.
    // -----------------------------------
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Creates a Scanner object

        System.out.println("Enter total number of seconds");

        double time = input.nextDouble();  // Reads user input

        // Calculates the greatest hours and minutes according to the seconds given. The leftover seconds
        // are calculated.
        int hour = (int)time / 3600;
        int minute = ((int)time % 3600) / 60;
        double second = (time % 3600) % 60;

        String hourWord;
        String minuteWord;
        String secondWord;

        // Tests whether to use plural form of hour, minute, and second depending on respective values.
        if (hour != 1) {
            hourWord = new String("hours");
        }
        else {
            hourWord = new String("hour");
        }

        if (minute != 1) {
            minuteWord = new String("minutes");
        }
        else {
            minuteWord = new String("minute");
        }

        if (second != 1) {
            secondWord = new String("seconds");
        }
        else {
            secondWord = new String("second");
        }

        System.out.println("Time is: " + hour + " " + hourWord + ", " + minute + " " + minuteWord + ", "
                + String.format("%.4f", second) + " " + secondWord); // Outputs string of time units according to user input
    }
}
