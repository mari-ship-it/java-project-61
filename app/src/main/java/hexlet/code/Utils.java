package hexlet.code;

import java.util.Random;
import static hexlet.code.games.Progression.PROGRESSION_LENGTH;

public class Utils {

    public static int generateRandomNumber(int minNum, int maxNum) {
        Random random = new Random();
        return random.nextInt(minNum, maxNum);
    }

    public static String[] generateOfArithmeticProgression(int randomNum, int stepOfProgression) {
        String[] arithmeticProgression = new String[PROGRESSION_LENGTH];
        int currentElement = randomNum;

        for (int i = 0; i < PROGRESSION_LENGTH; i++) {
            arithmeticProgression[i] = Integer.toString(currentElement);
            currentElement += stepOfProgression;
        }
        return arithmeticProgression;
    }
}
