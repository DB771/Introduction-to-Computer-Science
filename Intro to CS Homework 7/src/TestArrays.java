import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {
        // 1
        int[][] sales = {
                {200, 350, 400},
                {150, 375, 225}
        };
        int[] salesStats = ArrayMethods.salesRange(sales);
        System.out.println(Arrays.toString(salesStats));

        // 2
        Die[][] dice = new Die[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                dice[i][j] = new Die();
            }
        }
        int[] dieOdds = ArrayMethods.dieStats(dice);
        System.out.println(Arrays.toString(dieOdds));
    }
}

// Output:
//
// Test Result 1
// [150, 400, 250]
// [3, 4]
//
//Test Result 2
// [150, 400, 250]
// [2, 2]
