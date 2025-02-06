package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    public static String[] correctAnswer = new String[Engine.numbersOfRounds];

    public static void startProgressionGame() {
        String exercise = "What number is missing in the progression?";
        String[] question = new String[Engine.numbersOfRounds];

        for (int i = 0; i < Engine.numbersOfRounds; i++) {
            int randomNum = Engine.getRandomNumber(1, 100);
            int stepOfProgression = Engine.getRandomNumber(2, 5);
            int positionOfHiddenElement = Engine.getRandomNumber(2, 11);
            question[i] = getArithmeticProgression(randomNum, stepOfProgression, positionOfHiddenElement, i);
        }
        Engine.evenParity(exercise, question, correctAnswer);
    }

    public static String getArithmeticProgression(int randomNum, int stepOfProgression,
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
