package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.GAME_ROUNDS;
import static hexlet.code.Engine.MAX_NUMBER;

public class Calc {
    public static void calc(Scanner scanner) {
        var random = new Random();
        var userName = Cli.greetByName(scanner);
        var operators = new String[] {"+", "-", "*"};

        System.out.println("What is the result of the expression?");
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
            Engine.engine(
                scanner,
                firstNumber + " " + randomOperator + " " + secondNumber,
                Integer.toString(rightAnswer),
                userName
            );
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
