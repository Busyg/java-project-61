package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.*;

public class Even {
    public static void checkEven(Scanner scanner) {
        Random random = new Random();
        String [][] questionsArray = new String[3][];
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        for (var i = 0; i < GAME_ROUNDS; i++) {
            int number = random.nextInt(MAX_NUMBER);
            String rightAnswer = number % 2 == 0 ? "yes" : "no";
            questionsArray[i] = new String[] {Integer.toString(number), rightAnswer};
        }
        Engine.engine(scanner,questionsArray,rules);
    }
}
