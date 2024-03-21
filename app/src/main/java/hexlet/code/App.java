package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GDC\n"
                + "0 - Exit");
        String gameNumber = scanner.next();
        switch (gameNumber) {
            case "1":
                Cli.greetByName(scanner);
                break;
            case "2":
                Even.checkEven(scanner);
                break;
            case "3":
                Calc.calc(scanner);
                break;
            case "4":
                GCD.gcd(scanner);
                break;
            case "0":
            default:
                break;
        }

        scanner.close();
    }
}
