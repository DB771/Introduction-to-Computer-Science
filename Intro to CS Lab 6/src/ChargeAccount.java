import java.util.Scanner;
import java.text.NumberFormat;

public class ChargeAccount {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What was your previous balance?");
        double prevBalance = scan.nextDouble();
        System.out.println("What is the total of your additional charges?");
        double addedCharges = scan.nextDouble();

        double interest;
        if (prevBalance > 0) {
            interest = addedCharges * 0.02;
        }
        else {
            interest = 0;
        }

        double newBalance = prevBalance + addedCharges + interest;
        double minPayment;

        if (newBalance < 50) {
            minPayment = newBalance;
        }
        else if (newBalance <= 300) {
            minPayment = 50;
        }
        else {
            minPayment = newBalance * 0.2;
        }

        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println("CS CARD International Statement\n" +
                           "===============================\n");
        System.out.println("Previous Balance:      " + money.format(prevBalance) + "\n" +
                           "Additional Charges:    " + money.format(addedCharges) + "\n" +
                           "Interest:              " + money.format(interest) + "\n" +
                           "New Balance:           " + money.format(newBalance) + "\n" +
                           "Minimum Payment:       " + money.format(minPayment));
    }
}
