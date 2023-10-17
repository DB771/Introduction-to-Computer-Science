import java.util.Scanner;
import java.util.Random;

public class GradesTest {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        Grade entry = new Grade(input.nextInt());

        Random rand = new Random();

        int x;
        Grade otherEntry;
        int total = 0;
        do {
            x = rand.nextInt(61) + 40;
            otherEntry = new Grade(x);
            System.out.println(otherEntry.toString());
            if (otherEntry.getNumGrade() > entry.getNumGrade()) {
                total++;
            }
        } while (otherEntry.equals(entry));
        System.out.println(total);
    }
}