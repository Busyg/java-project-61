package hexlet.code;

import java.util.Random;

public class Utils {
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 100;
    public static final Random RANDOM = new Random();

    public static int randomInt() {
        return randomInt(MIN_NUMBER, MAX_NUMBER);
    }

    public static int randomInt(int maxNumber) {
        return RANDOM.nextInt(maxNumber);
    }

    public static int randomInt(int minNumber, int maxNumber) {
        return RANDOM.nextInt(minNumber, maxNumber);
    }
}
