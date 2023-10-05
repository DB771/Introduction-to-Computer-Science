// ************************************************************
// Cards.java
//
// Defines an enumerated type named Rank with values representing
// different ranks of playing card. Prints a blackjack hand, a two
// card hand, and the value of that hand.
// ************************************************************

public class Cards {
    enum Rank {ace, two, three, four, five, six, seven, eight, nine, ten,
        jack, queen, king} // defines enumerated type Rank

    //-----------------------------------------------------------------
    // Creates and uses variables of the Rank type.
    //-----------------------------------------------------------------
    public static void main(String[] args) { // Declares values of enumerated type Rank
        Rank highCard, faceCard, card1, card2;

        // Assigns values of enumerated type Rank to variables
        highCard = Rank.ace;
        faceCard = Rank.king;
        card1 = Rank.three;
        card2 = Rank.six;

        System.out.println("A blackjack hand: " + highCard + " and " + faceCard);

        // Assigns face value of card1 and card2 using ordinal method
        int card1Val = card1.ordinal() + 1;
        int card2Val = card2.ordinal() + 1;

        System.out.println("A two card hand: " + card1 + " and " + card2);
        System.out.println("Hand value: " + (card1Val + card2Val));
    }
}
