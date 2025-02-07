package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    public static String[] correctAnswer = new String[Engine.maxNumbersOfRounds];

    public static void launchTheGameProgression() {
        String exercise = "What number is missing in the progression?";
        String[] question = new String[Engine.maxNumbersOfRounds];

        for (int i = 0; i < Engine.maxNumbersOfRounds; i++) {
            int randomNum = Engine.generateRandomNumber(1, 100);
            int stepOfProgression = Engine.generateRandomNumber(2, 5);
            int positionOfHiddenElement = Engine.generateRandomNumber(2, 11);
            question[i] = generateOfArithmeticProgression(randomNum, stepOfProgression, positionOfHiddenElement, i);
        }
        Engine.setLogicOfGame(exercise, question, correctAnswer);
    }

    public static String generateOfArithmeticProgression(int randomNum, int stepOfProgression,
                                                         int positionOfHiddenElement, int j) {
        int progressionLength = 10;
        var arithmeticProgression = new StringBuilder();
        int currentElement = randomNum + stepOfProgression;

        for (int i = 0; i < progressionLength; i++) {

            if (i == positionOfHiddenElement) {
                arithmeticProgression.append("..");
                correctAnswer[j] = Integer.toString(currentElement);
                j++;
            } else {
                arithmeticProgression.append(" ").append(currentElement).append(" ");
            }
            currentElement += stepOfProgression;
        }
        return arithmeticProgression.toString();
    }
}
