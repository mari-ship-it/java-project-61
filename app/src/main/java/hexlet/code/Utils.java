package hexlet.code;

import java.util.Random;

public class Utils {

    public static int generateRandomNumber(int minNum, int maxNum) {
        Random random = new Random();
        return random.nextInt(minNum, maxNum);
    }
}
