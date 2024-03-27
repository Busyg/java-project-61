package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.*;

public class Calc {
    public static void calc(Scanner scanner) {
        var random = new Random();
        String [][] questionsArray = new String[3][];
        String rules = "What is the result of the expression?";
        var operators = new String[] {"+", "-", "*"};

        for (var i = 0; i < GAME_ROUNDS; i++) {
            var firstNumber = random.nextInt(MAX_NUMBER);
            var secondNumber = random.nextInt(MAX_NUMBER);
            var randomOperator = operators[random.nextInt(operators.length)];
            int rightAnswer = 0;

            switch (randomOperator) {
                case "+" -> {
                    rightAnswer = firstNumber + secondNumber;
                }
                case "-" -> {
                    rightAnswer = firstNumber - secondNumber;
                }
                case "*" -> {
                    rightAnswer = firstNumber * secondNumber;
                }
                default -> {
                }
            }
            questionsArray[i] = new String[] {firstNumber + " " + randomOperator + " " + secondNumber, Integer.toString(rightAnswer)};
        }
        Engine.engine(scanner,questionsArray,rules);
    }
}
