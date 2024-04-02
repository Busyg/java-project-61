package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int ROUNDS_COUNT = 3;

    public static void startGame(String[][] questionsArray, String rules) {
        Scanner scanner = new Scanner(System.in);
        String userName = Cli.greetByName();
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
