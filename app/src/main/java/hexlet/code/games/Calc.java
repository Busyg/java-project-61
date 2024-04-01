package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

import static hexlet.code.Engine.GAME_ROUNDS;
import static hexlet.code.Utils.randomInt;


public class Calc {
    public static final String[] OPERATORS = {"+", "-", "*"};
    public static void run(Scanner scanner) {
        String[][] questionsArray = new String[GAME_ROUNDS][];
        String rules = "What is the result of the expression?";
        for (var i = 0; i < GAME_ROUNDS; i++) {
            questionsArray[i] = generateRoundData();
        }
        Engine.startGame(scanner, questionsArray, rules);
    }

    public static String[] generateRoundData() {
        var firstNumber = randomInt();
        var secondNumber = randomInt();
        var randomOperator = OPERATORS[randomInt(OPERATORS.length)];
        int rightAnswer = calculateAnswer(randomOperator, firstNumber, secondNumber);
        return new String[] {
            firstNumber + " " + randomOperator + " " + secondNumber,
            Integer.toString(rightAnswer)
        };
    }

    public static int calculateAnswer(String operator, int firstNumber, int secondNumber) {
        return switch (operator) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            default -> throw new RuntimeException("Unknown operator");
        };
    }
}
