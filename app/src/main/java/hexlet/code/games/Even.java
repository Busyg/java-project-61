package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ROUNDS_COUNT;
import static hexlet.code.Utils.randomInt;

public class Even {
    public static void run() {
        String[][] questionsArray = new String[ROUNDS_COUNT][];
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        for (var i = 0; i < ROUNDS_COUNT; i++) {
            questionsArray[i] = generateRoundData();
        }
        Engine.startGame(questionsArray, rules);
    }

    public static String[] generateRoundData() {
        int number = randomInt();
        String rightAnswer = isEven(number) ? "yes" : "no";
        return new String[] {Integer.toString(number), rightAnswer};
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
