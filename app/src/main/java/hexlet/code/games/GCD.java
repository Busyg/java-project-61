package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

import static hexlet.code.Engine.GAME_ROUNDS;
import static hexlet.code.Utils.randomInt;

public class GCD {
    public static void gcd(Scanner scanner) {
        String[][] questionsArray = new String[GAME_ROUNDS][];
        String rules = "Find the greatest common divisor of given numbers.";
        for (var i = 0; i < GAME_ROUNDS; i++) {
            questionsArray[i] = generateRoundData();
        }
        Engine.engine(scanner, questionsArray, rules);
    }

    public static String[] generateRoundData() {
        var firstNumber = randomInt();
        var secondNumber = randomInt();
        int rightAnswer = getGcd(firstNumber, secondNumber);
        return new String[] {firstNumber + " " + secondNumber, Integer.toString(rightAnswer)};
    }

    static int getGcd(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        } else {
            return getGcd(secondNumber, firstNumber % secondNumber);
        }
    }
}
