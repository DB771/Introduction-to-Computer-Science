import java.util.Scanner;

public class GradingQuizzes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many questions are in the quiz? ");
        int numQuestions = input.nextInt();
        input.nextLine();

        System.out.println("\nWhat is the key?\n");
        int[] key = new int[numQuestions];
        for (int i = 0; i < key.length; i++) {
            System.out.print("Enter the key for question " + (i+1) + ": ");
            key[i] = input.nextInt();
            input.nextLine();
        }

        boolean anotherQuiz = true;
        while (anotherQuiz){
            int numCorrect = key.length;
            System.out.println("\nWhat are the answers to be graded?\n");
            for (int i = 0; i < key.length; i++) {
                System.out.print("Enter the answer to be graded for question " + (i+1) + ": ");
                if (key[i] != input.nextInt()) {
                    numCorrect--;
                }
                input.nextLine();
            }
            System.out.println("\nThe number of questions that are correct is " + numCorrect);
            System.out.println("The number of questions that are incorrect is " + (key.length - numCorrect));

            String choice;
            do {
                System.out.print("\nGrade another quiz? (y/n). ");
                choice = input.nextLine();
            } while (!choice.equals("y") && !choice.equals("n"));
            if (choice.equals("n")) {
                anotherQuiz = false;
            }
        }

        input.close();
    }
}
