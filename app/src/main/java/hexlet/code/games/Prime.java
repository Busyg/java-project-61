package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

import static hexlet.code.Engine.GAME_ROUNDS;
import static hexlet.code.Utils.randomInt;

public class Prime {
    public static void prime(Scanner scanner) {
        String[][] questionsArray = new String[GAME_ROUNDS][];
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        for (var i = 0; i < GAME_ROUNDS; i++) {
            questionsArray[i] = generateRoundData();
        }
        Engine.engine(scanner, questionsArray, rules);
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
