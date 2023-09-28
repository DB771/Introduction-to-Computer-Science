// ************************************************************
// RandomPlate.java
//
// Generates a random license plate number consisting of 5
// uppercase letters followed by 2 digits.
// ************************************************************

import java.util.Random;  // Imports the Random class

public class RandomPlate {
    public static void main(String[] args) {
        Random generator = new Random(); // Creates a Random object
        char letter1;
        char letter2;
        char letter3;
        char letter4;
        char letter5;
        int digit1;
        int digit2;

        // Casts char to randomly generated number starting with the position
        // of 'A' until 'Z' on the ASCII character table
        letter1 = (char)(generator.nextInt(26) + 'A');
        System.out.print(letter1);

        letter2 = (char)(generator.nextInt(26) + 'A');
        System.out.print(letter2);

        letter3 = (char)(generator.nextInt(26) + 'A');
        System.out.print(letter3);

        letter4 = (char)(generator.nextInt(26) + 'A');
        System.out.print(letter4);

        letter5 = (char)(generator.nextInt(26) + 'A');
        System.out.print(letter5);

        digit1 = generator.nextInt(9); // Generates random int from 0-9
        System.out.print(digit1);

        digit2 = generator.nextInt(9);
        System.out.print(digit2);
    }
}
