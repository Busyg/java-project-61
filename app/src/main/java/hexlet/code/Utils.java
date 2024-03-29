package hexlet.code;

import java.util.Random;

public class Utils {
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 100;
    public static int randomInt() {
        return new Random().nextInt(MIN_NUMBER, MAX_NUMBER);
    }

    public static int randomInt(int maxNumber) {
        return new Random().nextInt(maxNumber);
    }

    public static int randomInt(int minNumber, int maxNumber) {
        return new Random().nextInt(minNumber, maxNumber);
    }
}
