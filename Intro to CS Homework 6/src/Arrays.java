import java.util.Random;

public class Arrays {
    public static int[] numberFreq() {
        int[] numArr = new int[6];
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            numArr[rand.nextInt(6)]++; // array element from 0-5 (random) incremented as frequency
        }
        return numArr;
    }

    public static int[] fibo(int total) {
        int[] fibSeq = new int[total];
        if (total == 0) {
            return null;
        }
        if (total >= 1) { // Base case- first element is 1
            fibSeq[0] = 1;
        }
        if (total >= 2) { // Base case- second element is 1
            fibSeq[1] = 1;
        }
        for (int i = 2; i < total; i++) {
            fibSeq[i] = fibSeq[i - 1] + fibSeq[i - 2];
        }
        return fibSeq;
    }

    public static int oddDice(Die[] dice) {
        int count = 0; // initial number of dice that landed odd
        for (Die die : dice) { // for each element in dice
            if (die.roll() % 2 != 0) {
            count++;
            }
        }
        return count;
    }

}
