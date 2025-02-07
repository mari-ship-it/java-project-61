package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    private static final String[] CORRECT_ANSWERS = new String[Engine.getMaxNumbersOfRounds()];
    private static final int PROGRESSION_LENGTH = 10;
    private static final int MAX_VALUE_STEP_OF_PROGRESSION = 5;

    public static void launchTheGameProgression() {
        String exercise = "What number is missing in the progression?";
        String[] question = new String[Engine.getMaxNumbersOfRounds()];

        for (int i = 0; i < Engine.getMaxNumbersOfRounds(); i++) {

            int randomNum = Engine.generateRandomNumber(1, Calc.MAX_VALUE_RANDOM_NUM);
            int stepOfProgression = Engine.generateRandomNumber(2, MAX_VALUE_STEP_OF_PROGRESSION);
            int positionOfHiddenElement = Engine.generateRandomNumber(1, PROGRESSION_LENGTH);
            question[i] = generateOfArithmeticProgression(randomNum, stepOfProgression, positionOfHiddenElement, i);
        }
        Engine.setLogicOfGame(exercise, question, CORRECT_ANSWERS);
    }

    public static String generateOfArithmeticProgression(int randomNum, int stepOfProgression,
                                                         int positionOfHiddenElement, int j) {
        var arithmeticProgression = new StringBuilder();
        int currentElement = randomNum + stepOfProgression;

        for (int i = 0; i < PROGRESSION_LENGTH; i++) {

            if (i == positionOfHiddenElement) {
                arithmeticProgression.append(" ").append("..");
                CORRECT_ANSWERS[j] = Integer.toString(currentElement);
                j++;
            } else {
                arithmeticProgression.append(" ").append(currentElement);
            }
            currentElement += stepOfProgression;
        }
        return (arithmeticProgression.toString()).trim();
    }
}
