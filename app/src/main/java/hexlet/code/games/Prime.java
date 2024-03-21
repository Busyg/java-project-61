package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void prime(Scanner scanner) {
        var random = new Random();
        var userName = Cli.greetByName(scanner);

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (var i = 0; i < 3; i++) {
            int number = random.nextInt(100);
            String rightAnswer = isPrime(number) ? "yes" : "no";
            Engine.engine(scanner, Integer.toString(number), rightAnswer, userName);
        }
        System.out.println("Congratulations, " + userName + "!");
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