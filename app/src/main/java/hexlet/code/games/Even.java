package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static void launchTheGameEven() {
        String exercise = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] roundsData = new String[Engine.MAX_NUMBERS_OF_ROUNDS][2];

        for (var i = 0; i < Engine.MAX_NUMBERS_OF_ROUNDS; i++) {
            int randomNum = Utils.generateRandomNumber(1, Calc.MAX_VALUE_RANDOM_NUM);
            roundsData[i][Engine.QUESTION_INDEX] = Integer.toString(randomNum);
            roundsData[i][Engine.ANSWER_INDEX] = isEven(randomNum) ? "yes" : "no";
        }
        Engine.setLogicOfGame(exercise, roundsData);
    }

    private static boolean isEven(int randomNum) {
        return randomNum % 2 == 0;
    }
}
