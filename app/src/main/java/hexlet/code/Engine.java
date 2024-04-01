package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int GAME_ROUNDS = 3;

    public static void startGame(Scanner scanner, String[][] questionsArray, String rules) {
        String userName = Cli.greetByName(scanner);
        System.out.println(rules);
        for (String[] question : questionsArray) {
            System.out.println("Question: " + question[0]);
            String answer = scanner.next();
            System.out.println("Your answer: " + answer);
            if (answer.equals(question[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + question[1] + "'.\n"
                        + "Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
