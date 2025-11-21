package hexlet.code;

import java.util.Scanner;

public class Cli {
    private Cli() {}

    public static void runGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.nextLine();
        System.out.printf("Hello %s!%n", name);
    }
}
