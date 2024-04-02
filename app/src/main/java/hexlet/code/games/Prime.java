package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ROUNDS_COUNT;
import static hexlet.code.Utils.randomInt;

public class Prime {
    public static void run() {
        String[][] questionsArray = new String[ROUNDS_COUNT][];
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        for (var i = 0; i < ROUNDS_COUNT; i++) {
            questionsArray[i] = generateRoundData();
        }
        Engine.startGame(questionsArray, rules);
    }

    public static String[] generateRoundData() {
        int number = randomInt();
        String rightAnswer = isPrime(number) ? "yes" : "no";
        return new String[] {Integer.toString(number), rightAnswer};
    }

    public static  boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if ((number % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
