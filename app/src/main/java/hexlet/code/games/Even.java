package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.GAME_ROUNDS;
import static hexlet.code.Engine.MAX_NUMBER;

public class Even {
    public static void checkEven(Scanner scanner) {
        Random random = new Random();
        String userName = Cli.greetByName(scanner);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (var i = 0; i < GAME_ROUNDS; i++) {
            int number = random.nextInt(MAX_NUMBER);
            String rightAnswer = number % 2 == 0 ? "yes" : "no";
            Engine.engine(scanner, Integer.toString(number), rightAnswer, userName);
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
