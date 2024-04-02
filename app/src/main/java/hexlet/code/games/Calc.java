package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ROUNDS_COUNT;
import static hexlet.code.Utils.randomInt;


public class Calc {
    public static final String[] OPERATORS = {"+", "-", "*"};
    public static void run() {
        String[][] questionsArray = new String[ROUNDS_COUNT][];
        String rules = "What is the result of the expression?";
        for (var i = 0; i < ROUNDS_COUNT; i++) {
            questionsArray[i] = generateRoundData();
        }
        Engine.startGame(questionsArray, rules);
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
