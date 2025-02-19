package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    public static void launchTheGameProgression() {

        final int maxValueRandomNum = 100;
        final int minValueRandomNum = 0;
        final int maxValueStepOfProgression = 5;
        final int progressionLength = 10;
        final String exercise = "What number is missing in the progression?";
        String[][] roundsData = new String[Engine.MAX_NUMBERS_OF_ROUNDS][2];

        for (int i = 0; i < Engine.MAX_NUMBERS_OF_ROUNDS; i++) {

            final int randomNum = Utils.generateRandomNumber(minValueRandomNum, maxValueRandomNum);
            final int stepOfProgression = Utils.generateRandomNumber(2, maxValueStepOfProgression);
            final int positionOfHiddenElem = Utils.generateRandomNumber(1, progressionLength);
            roundsData[i][Engine.QUESTION_INDEX] =
                    getQuestionStr(randomNum, stepOfProgression, progressionLength, positionOfHiddenElem);
            roundsData[i][Engine.ANSWER_INDEX] =
                    getCurrentAnswer(randomNum, stepOfProgression, progressionLength, positionOfHiddenElem);
        }
        Engine.setLogicOfGame(exercise, roundsData);
    }

    private static String[] generateOfArithmeticProgression(int randomNum, int stepOfProgression,
                                                            int progressionLength) {

        String[] arithmeticProgression = new String[progressionLength];
        int current = randomNum;

        for (int i = 0; i < progressionLength; i++) {

            arithmeticProgression[i] = Integer.toString(current);
            current += stepOfProgression;
        }
        return arithmeticProgression;
    }

    private static String getQuestionStr(int num, int stepOfProgression, int progressionLength,
                                         int positionOfHiddenElement) {

        String[] progression = generateOfArithmeticProgression(num, stepOfProgression, progressionLength);
        progression[positionOfHiddenElement] = "..";
        return String.join(" ", progression);
    }

    private static String getCurrentAnswer(int num, int stepOfProgression, int progressionLength,
                                           int positionOfHiddenElement) {

        String[] progression = generateOfArithmeticProgression(num, stepOfProgression, progressionLength);
        return progression[positionOfHiddenElement];
    }
}
