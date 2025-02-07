package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    public static void launchTheGameGCD() {

        String exercise = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[Engine.maxNumbersOfRounds];
        String[]  correctAnswers = new String[Engine.maxNumbersOfRounds];

        for (int i = 0; i < Engine.maxNumbersOfRounds; i++) {
            int firstNum = Engine.generateRandomNumber(1, 100);
            int randomNum2 = Engine.generateRandomNumber(1, 100);
            questions[i] = firstNum + " " + randomNum2;
            correctAnswers[i] = Integer.toString(getGreatestCommonDivisor(firstNum, randomNum2));
        }
        Engine.setLogicOfGame(exercise, questions, correctAnswers);
    }

    public static int getGreatestCommonDivisor(int num1, int num2) {
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
