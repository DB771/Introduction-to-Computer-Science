import java.util.Scanner;

public class ExecutiveTest1 {
    public static void main(String[] args) throws BonusTooHighException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of executives: ");
        int numExecutives = scanner.nextInt();
        scanner.nextLine();

        Executive[] executives = new Executive[numExecutives];

        for (int i = 0; i < numExecutives; i++) {
            try {
                executives[i] = new Executive("", "", "", "", 0);

                System.out.print("Enter Executive " + (i + 1) + " name: ");
                executives[i].setName(scanner.nextLine());

                System.out.print("Enter Executive " + (i + 1) + " address: ");
                executives[i].setAddress(scanner.nextLine());

                System.out.print("Enter Executive " + (i + 1) + " phone number: ");
                executives[i].setPhone(scanner.nextLine());

                System.out.print("Enter Executive " + (i + 1) + " social security number: ");
                executives[i].setSocialSecurityNumber(scanner.nextLine());

                System.out.print("Enter Executive " + (i + 1) + " pay rate: ");
                executives[i].setPayRate(scanner.nextDouble());

                System.out.print("Enter Executive " + (i + 1) + " bonus: $");

                executives[i].awardBonus(scanner.nextDouble());
            }

            catch (BonusTooHighException ex) {
                System.out.println("Error: " + ex.getMessage());
                System.out.println("Bonus is now $0.");
                executives[i].awardBonus(0);
            }
            scanner.nextLine();
        }

        System.out.println("Executives:");
        for (Executive executive : executives) {
            System.out.println(executive);
        }
    }
}