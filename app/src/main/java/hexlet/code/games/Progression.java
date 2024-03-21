package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void progression(Scanner scanner) {
        var random = new Random();
        var userName = Cli.greetByName(scanner);

        System.out.println("Find the greatest common divisor of given numbers.");
        for (var i = 0; i < 3; i++) {
            var progressionElements = random.nextInt(5, 10);
            var firstNumber = random.nextInt(1, 100);
            var progressionString = Integer.toString(firstNumber);
            var step = random.nextInt(1, 10);
            var questionIndex = random.nextInt(1, progressionElements);
            var rightAnswer = 0;

            for (var y = 1; y < progressionElements; y++) {
                if (y == questionIndex) {
                    rightAnswer = firstNumber + (step * y);
                    progressionString += " ..";
                } else {
                    progressionString += " " + (firstNumber + (step * y));
                }
            }

            Engine.engine(
                    scanner,
                    progressionString,
                    Integer.toString(rightAnswer),
                    userName
            );
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
