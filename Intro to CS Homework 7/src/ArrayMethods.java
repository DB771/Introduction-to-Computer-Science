public class ArrayMethods {
    public static int[] salesRange(int[][] sales) {
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE, range;
        for (int[] weeklySales : sales) {
            for (int individualSales : weeklySales) {
                low = Math.min(low, individualSales);
                high = Math.max(high, individualSales);
            }
        }
        range = high - low;
        int[] salesReport = new int[] {low, high, range};
        return salesReport;
    }

    public static int[] dieStats(Die[][] dice) {
        int[] oddsRow = new int[dice.length];
        int i = 0;
        int i = 0;
        int odds = 0;
        for (Die[] dieRow : dice) {
            for (Die die : dieRow) {
                if (die.roll() % 2 != 0) {
                    odds++;
                }
            }
            oddsRow[i] = odds;
            i++;
        }
        return oddsRow;
    }
}
