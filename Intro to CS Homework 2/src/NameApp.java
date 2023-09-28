// ************************************************************
// NameApp.java
//
// Takes in the user's first and last names and outputs their
// initials and the total length of their name.
// ************************************************************

import java.util.Scanner;  // Imports the Scanner class

public class NameApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Creates a Scanner object

        System.out.println("Enter your first name: ");
        String firstName = input.nextLine(); // Takes in user first name as input

        System.out.println("Enter your last name: ");
        String lastName = input.nextLine(); // Takes in user last name as input

        // Prints the character at position 0 in the String firstName and String lastName
        System.out.println("initials: " + firstName.substring(0, 1) + lastName.substring(0, 1));

        // Prints the length of String firstName and String lastName
        System.out.println("total length: " + (firstName.length() + lastName.length()));
    }
}