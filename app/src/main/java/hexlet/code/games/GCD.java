package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static void gcd(Scanner scanner) {
        var random = new Random();
        var userName = Cli.greetByName(scanner);

        System.out.println("Find the greatest common divisor of given numbers.");
        for (var i = 0; i < 3; i++) {
            var firstNumber = random.nextInt(100);
            var secondNumber = random.nextInt(100);
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
