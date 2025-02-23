package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static void launchTheGameEven() {

        final int maxValueRandomNum = 100;
        final int minValueRandomNum = 0;
        final String exercise = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] roundsData = new String[Engine.MAX_NUMBERS_OF_ROUNDS][2];

        for (var i = 0; i < Engine.MAX_NUMBERS_OF_ROUNDS; i++) {

            final int randomNum = Utils.generateRandomNumber(minValueRandomNum, maxValueRandomNum);
            roundsData[i][Engine.QUESTION_INDEX] = Integer.toString(randomNum);
            roundsData[i][Engine.ANSWER_INDEX] = isEven(randomNum) ? "yes" : "no";
        }
        Engine.setLogicOfGame(exercise, roundsData);
    }

    private static boolean isEven(int randomNum) {
        return randomNum % 2 == 0;
    }
}
