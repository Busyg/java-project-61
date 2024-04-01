package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

import static hexlet.code.Engine.GAME_ROUNDS;
import static hexlet.code.Utils.randomInt;

public class Even {
    public static void run(Scanner scanner) {
        String[][] questionsArray = new String[GAME_ROUNDS][];
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        for (var i = 0; i < GAME_ROUNDS; i++) {
            questionsArray[i] = generateRoundData();
        }
        Engine.startGame(scanner, questionsArray, rules);
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
