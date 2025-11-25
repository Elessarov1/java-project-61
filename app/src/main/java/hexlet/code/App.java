package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        int gameNumber = scanner.nextInt();
        System.out.printf("Your choice: %d%n%n", gameNumber);
        scanner.nextLine();

        if (gameNumber == 1) {
            Cli.runGreet();
        } else if (gameNumber == 2) {
            Cli.runEven(scanner);
        }
    }
}