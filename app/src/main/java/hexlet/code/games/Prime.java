package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.GAME_ROUNDS;
import static hexlet.code.Engine.MAX_NUMBER;

public class Prime {
    public static void prime(Scanner scanner) {
        var random = new Random();
        String[][] questionsArray = new String[GAME_ROUNDS][];
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        for (var i = 0; i < GAME_ROUNDS; i++) {
            int number = random.nextInt(MAX_NUMBER);
            String rightAnswer = isPrime(number) ? "yes" : "no";
            questionsArray[i] = new String[] {Integer.toString(number), rightAnswer};
        }
        Engine.engine(scanner, questionsArray, rules);
    }

    static  boolean isPrime(int number) {
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
