public class TestMCoins {
    public static void main(String[] args) {
        // Create a 3x5 array, initialize and flip coins
        MonetaryCoin[][] coins = new MonetaryCoin[3][5];
        flipCoins(coins);

        // Compute and print the total monetary value for each row with HEADS face
        for (int i = 0; i < coins.length; i++) {
            int totalHeadsValue = findHeadsValue(coins[i]);
            System.out.print(totalHeadsValue);
            if (i < coins.length - 1) {
                System.out.print(", ");
            }
        }
    }

    // Method to initialize and flip coins in the array
    private static void flipCoins(MonetaryCoin[][] coins) {
        for (int i = 0; i < coins.length; i++) {
            for (int j = 0; j < coins[i].length; j++) {
                int randomValue = (int) (Math.random() * 100) + 1;
                coins[i][j] = new MonetaryCoin(randomValue);
                coins[i][j].flip();
            }
        }
    }

    // Method to compute the total value of coins with HEADS face in row
    private static int findHeadsValue(MonetaryCoin[] coins) {
        int totalHeadsValue = 0;
        for (MonetaryCoin coin : coins) {
            if (coin.isHeads()) {
                totalHeadsValue += coin.getValue();
            }
        }
        return totalHeadsValue;
    }
}