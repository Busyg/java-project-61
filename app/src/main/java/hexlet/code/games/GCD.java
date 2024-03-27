package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.GAME_ROUNDS;
import static hexlet.code.Engine.MAX_NUMBER;

public class GCD {
    public static void gcd(Scanner scanner) {
        var random = new Random();
        String [][] questionsArray = new String[3][];
        String rules = "Find the greatest common divisor of given numbers.";

        for (var i = 0; i < GAME_ROUNDS; i++) {
            var firstNumber = random.nextInt(MAX_NUMBER);
            var secondNumber = random.nextInt(MAX_NUMBER);
            int rightAnswer = getGcd(firstNumber, secondNumber);

            questionsArray[i] = new String[] {firstNumber + " " + secondNumber, Integer.toString(rightAnswer)};
        }
        Engine.engine(scanner,questionsArray,rules);
    }

    static int getGcd(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        } else {
            return getGcd(secondNumber, firstNumber % secondNumber);
        }
    }
}
