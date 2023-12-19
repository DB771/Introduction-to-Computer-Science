public class TestRecursion {
    public static void printDigits(int num) {
        if (num / 10 == 0) {
            System.out.println(num % 10);
        }
        else {
            printDigits(num / 10);
            System.out.println(num % 10);
        }
    }

    public static int sumArray(int[] numArray, int count) {
        if (count == 1) {
            return numArray[0];
        }
        else {
            return numArray[count - 1] + sumArray(numArray, count - 1);
        }
    }

    public static void main(String[] args) {
        // Question 1
        int digits = 123147;
        printDigits(digits);
        System.out.println();

        // Question 2
        int[] a ={1,3,2,5};
        System.out.println(sumArray(a,3)); // displays 6
        System.out.println(sumArray(a,4)); // displays 11
    }

}
