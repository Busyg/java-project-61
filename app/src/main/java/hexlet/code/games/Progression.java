package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.GAME_ROUNDS;
import static hexlet.code.Engine.MAX_NUMBER;
import static hexlet.code.Engine.MIN_NUMBER;

public class Progression {

    public static final int MIN_PROGRESSION = 5;
    public static final int MAX_PROGRESSION = 10;

    public static void progression(Scanner scanner) {
        var random = new Random();
        String[][] questionsArray = new String[GAME_ROUNDS][];
        String rules = "What number is missing in the progression?";

        for (var i = 0; i < GAME_ROUNDS; i++) {
            var progressionElements = random.nextInt(MIN_PROGRESSION, MAX_PROGRESSION);
            var firstNumber = random.nextInt(MIN_NUMBER, MAX_NUMBER);
            var progressionString = Integer.toString(firstNumber);
            var step = random.nextInt(MIN_NUMBER, MAX_NUMBER);
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

            questionsArray[i] = new String[] {progressionString, Integer.toString(rightAnswer)};
        }
        Engine.engine(scanner, questionsArray, rules);
    }
}
