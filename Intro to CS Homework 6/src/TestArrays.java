public class TestArrays {
    public static void main(String[] args) {
        // 1
        int[] numFreq = Arrays.numberFreq();
        for (int i = 0; i < numFreq.length; i++) { // iterate through each element
            System.out.println("Frequency of " + i + ": " + numFreq[i]);
        }

        // 2
        int[] fibonacciSeq = Arrays.fibo(8);
        for (int i = 0; i < fibonacciSeq.length; i++) {
            System.out.print(fibonacciSeq[i]);
            if ((i + 1) < fibonacciSeq.length) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // 3
        Die[] rolls = new Die[9];
        for (int i = 0; i < rolls.length; i++) {
            rolls[i] = new Die(); // each element in Die array becomes new Die object for x length
        }
        int oddCount = Arrays.oddDice(rolls);
        System.out.println("Number of odd dice: " + oddCount);
    }
}
