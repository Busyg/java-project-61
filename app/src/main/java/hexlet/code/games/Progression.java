package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ROUNDS_COUNT;
import static hexlet.code.Utils.randomInt;;

public class Progression {

    public static final int MIN_PROGRESSION = 5;
    public static final int MAX_PROGRESSION = 10;

    public static void run() {
        String[][] questionsArray = new String[ROUNDS_COUNT][];
        String rules = "What number is missing in the progression?";
        for (var i = 0; i < ROUNDS_COUNT; i++) {
            questionsArray[i] = generateRoundData();
        }
        Engine.startGame(questionsArray, rules);
    }

    public static String[] generateRoundData() {
        var progressionElements = randomInt(MIN_PROGRESSION, MAX_PROGRESSION);
        var firstNumber = randomInt();
        var step = randomInt();
        var questionIndex = randomInt(1, progressionElements);
        var rightAnswer = firstNumber + (step * questionIndex);
        var progressionArr = generateProgression(firstNumber, step, progressionElements);
        progressionArr[questionIndex] = "..";
        return new String[] {String.join(" ", progressionArr), Integer.toString(rightAnswer)};
    }

    public static String[] generateProgression(int firstNumber, int step, int progressionElements) {
        var progressionString = new String[progressionElements];
        progressionString[0] = Integer.toString(firstNumber);
        for (var i = 1; i < progressionElements; i++) {
            progressionString[i] = Integer.toString(firstNumber + (step * i));
        }
        return progressionString;
    }
}
