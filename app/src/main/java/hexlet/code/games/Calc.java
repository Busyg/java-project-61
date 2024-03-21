package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void calc(Scanner scanner) {
        var random = new Random();
        var userName = Cli.greetByName(scanner);
        var operators = new String[] {"+", "-", "*"};

        System.out.println("What is the result of the expression?");
        for (var i = 0; i < 3; i++) {
            var firstNumber = random.nextInt(100);
            var secondNumber = random.nextInt(100);
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
