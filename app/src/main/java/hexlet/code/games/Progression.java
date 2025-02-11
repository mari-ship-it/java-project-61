package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    public static final int PROGRESSION_LENGTH = 10;
    private static final int MAX_VALUE_STEP_OF_PROGRESSION = 5;

    public static void launchTheGameProgression() {
        String exercise = "What number is missing in the progression?";
        String[][] roundsData = new String[Engine.MAX_NUMBERS_OF_ROUNDS][2];

        for (int i = 0; i < Engine.MAX_NUMBERS_OF_ROUNDS; i++) {
            int randomNum = Utils.generateRandomNumber(1, Calc.MAX_VALUE_RANDOM_NUM);
            int stepOfProgression = Utils.generateRandomNumber(2, MAX_VALUE_STEP_OF_PROGRESSION);
            int positionOfHiddenElem = Utils.generateRandomNumber(1, PROGRESSION_LENGTH);
            roundsData[i][Engine.QUESTION_INDEX] = getQuestionStr(randomNum, stepOfProgression, positionOfHiddenElem);
            roundsData[i][Engine.ANSWER_INDEX] = getCurrentAnswer(randomNum, stepOfProgression, positionOfHiddenElem);
        }
        Engine.setLogicOfGame(exercise, roundsData);
    }

    private static String getQuestionStr(int num, int stepOfProgression, int positionOfHiddenElement) {
        String[] progression = Utils.generateOfArithmeticProgression(num, stepOfProgression);
        progression[positionOfHiddenElement] = "..";
        return String.join(" ", progression);
    }

    private static String getCurrentAnswer(int num, int stepOfProgression, int positionOfHiddenElement) {
        String[] progression = Utils.generateOfArithmeticProgression(num, stepOfProgression);
        return progression[positionOfHiddenElement];
    }
}
