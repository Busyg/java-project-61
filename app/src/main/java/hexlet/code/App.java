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
            case "2" -> Even.run(scanner);
            case "3" -> Calc.run(scanner);
            case "4" -> GCD.run(scanner);
            case "5" -> Progression.run(scanner);
            case "6" -> Prime.run(scanner);
            default -> {
            }
        }

        scanner.close();
    }
}
