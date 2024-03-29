package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

import static hexlet.code.Engine.GAME_ROUNDS;
import static hexlet.code.Utils.randomInt;;

public class Progression {

    public static final int MIN_PROGRESSION = 5;
    public static final int MAX_PROGRESSION = 10;

    public static void progression(Scanner scanner) {
        String[][] questionsArray = new String[GAME_ROUNDS][];
        String rules = "What number is missing in the progression?";
        for (var i = 0; i < GAME_ROUNDS; i++) {
            questionsArray[i] = generateRoundData();
        }
        Engine.engine(scanner, questionsArray, rules);
    }

    public static String[] generateRoundData() {
        var progressionElements = randomInt(MIN_PROGRESSION, MAX_PROGRESSION);
        var firstNumber = randomInt();
        var step = randomInt();
        var questionIndex = randomInt(1, progressionElements);
        var rightAnswer = firstNumber + (step * questionIndex);
        var progressionString = generateProgression(firstNumber, step, progressionElements, questionIndex);
        return new String[] {progressionString, Integer.toString(rightAnswer)};
    }

    public static String generateProgression(int firstNumber, int step, int progressionElements, int questionIndex) {
        var progressionString = Integer.toString(firstNumber);
        for (var y = 1; y < progressionElements; y++) {
            if (y == questionIndex) {
                progressionString += " ..";
            } else {
                progressionString += " " + (firstNumber + (step * y));
            }
        }
        return progressionString;
    }
}