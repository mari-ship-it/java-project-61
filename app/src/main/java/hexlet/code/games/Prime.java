package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static void launchTheGamePrime() {

        final int maxValueRandomNum = 100;
        final int minValueRandomNum = 0;
        final String exercise = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] roundsData = new String[Engine.MAX_NUMBERS_OF_ROUNDS][2];

        for (int i = 0; i < Engine.MAX_NUMBERS_OF_ROUNDS; i++) {

            final int randomNum = Utils.generateRandomNumber(minValueRandomNum, maxValueRandomNum);
            roundsData[i][Engine.QUESTION_INDEX] = Integer.toString(randomNum);
            roundsData[i][Engine.ANSWER_INDEX] = randomNum < 2 || hasDivisorsOfNumber(randomNum) ? "no" : "yes";
        }
        Engine.setLogicOfGame(exercise, roundsData);
    }

    private static boolean hasDivisorsOfNumber(int randomNum) {

        int i = 2;
        while (i < randomNum) {
            if (randomNum % i == 0) {
                return  true;
            }
            ++i;
        }
        return false;
    }
}
