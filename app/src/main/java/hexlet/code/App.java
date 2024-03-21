package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GDC
                5 - Progression
                6 - Prime
                0 - Exit""");
        String gameNumber = scanner.next();
        switch (gameNumber) {
            case "1" -> Cli.greetByName(scanner);
            case "2" -> Even.checkEven(scanner);
            case "3" -> Calc.calc(scanner);
            case "4" -> GCD.gcd(scanner);
            case "5" -> Progression.progression(scanner);
            case "6" -> Prime.prime(scanner);
            default -> {
            }
        }

        scanner.close();
    }
}
