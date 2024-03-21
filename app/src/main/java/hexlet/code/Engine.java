package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void engine(Scanner scanner, String question, String rightAnswer, String userName) {
        System.out.println("Question: " + question);
        String answer = scanner.next();
        System.out.println("Your answer: " + answer);
        if (answer.equals(rightAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.\n"
                    + "Let's try again, " + userName + "!");
            System.exit(0);
        }
    }
}
