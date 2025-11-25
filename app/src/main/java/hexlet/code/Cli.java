package hexlet.code;

import java.util.Scanner;

public class Cli {
    private Cli() {}

    public static void runGreet() {

    }

    public static void runEven(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.nextLine();
        System.out.printf("Hello, %s!%n", name);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        final int answersToWin = 3;
        int correctAnswersInRow = 0;

        while (correctAnswersInRow < answersToWin) {
            int number = (int) (Math.random() * 100);
            String correctAnswer = isEven(number)
                    ? "yes"
                    : "no";

            System.out.printf("Question: %d%n", number);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim().toLowerCase();

            if (!userAnswer.equals(correctAnswer)) {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.%n", userAnswer, correctAnswer);
                System.out.printf("Let's try again, %s!%n", name);
                return;
            }

            System.out.println("Correct!");
            correctAnswersInRow++;
        }

        System.out.printf("Congratulations, %s!%n", name);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
