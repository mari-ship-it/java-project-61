package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    public static void launchTheGameGCD() {

        final int maxValueRandomNum = 100;
        final int minValueRandomNum = 0;
        final String exercise = "Find the greatest common divisor of given numbers.";
        String[][] roundsData = new String[Engine.MAX_NUMBERS_OF_ROUNDS][2];

        for (int i = 0; i < Engine.MAX_NUMBERS_OF_ROUNDS; i++) {

            int firstNum = Utils.generateRandomNumber(minValueRandomNum, maxValueRandomNum);
            int randomNum2 = Utils.generateRandomNumber(minValueRandomNum, maxValueRandomNum);
            roundsData[i][Engine.QUESTION_INDEX] = firstNum + " " + randomNum2;
            roundsData[i][Engine.ANSWER_INDEX] = Integer.toString(getGreatestCommonDivisor(firstNum, randomNum2));
        }
        Engine.setLogicOfGame(exercise, roundsData);
    }

    private static int getGreatestCommonDivisor(int num1, int num2) {

        while (num1 != num2) {
            if (num1 > num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
        }
        return num1;
    }
}
