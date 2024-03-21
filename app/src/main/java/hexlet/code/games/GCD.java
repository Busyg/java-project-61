package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.GAME_ROUNDS;
import static hexlet.code.Engine.MAX_NUMBER;

public class GCD {
    public static void gcd(Scanner scanner) {
        var random = new Random();
        var userName = Cli.greetByName(scanner);

        System.out.println("Find the greatest common divisor of given numbers.");
        for (var i = 0; i < GAME_ROUNDS; i++) {
            var firstNumber = random.nextInt(MAX_NUMBER);
            var secondNumber = random.nextInt(MAX_NUMBER);
            int rightAnswer = getGcd(firstNumber, secondNumber);

            Engine.engine(
                    scanner,
                    firstNumber + " " + secondNumber,
                    Integer.toString(rightAnswer),
                    userName
            );
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    static int getGcd(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        } else {
            return getGcd(secondNumber, firstNumber % secondNumber);
        }
    }
}
