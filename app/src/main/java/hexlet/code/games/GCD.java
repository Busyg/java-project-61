package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ROUNDS_COUNT;
import static hexlet.code.Utils.randomInt;

public class GCD {
    public static void run() {
        String[][] questionsArray = new String[ROUNDS_COUNT][];
        String rules = "Find the greatest common divisor of given numbers.";
        for (var i = 0; i < ROUNDS_COUNT; i++) {
            questionsArray[i] = generateRoundData();
        }
        Engine.startGame(questionsArray, rules);
    }

    public static String[] generateRoundData() {
        var firstNumber = randomInt();
        var secondNumber = randomInt();
        int rightAnswer = calculateGcd(firstNumber, secondNumber);
        return new String[] {firstNumber + " " + secondNumber, Integer.toString(rightAnswer)};
    }

    static int calculateGcd(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        } else {
            return calculateGcd(secondNumber, firstNumber % secondNumber);
        }
    }
}
