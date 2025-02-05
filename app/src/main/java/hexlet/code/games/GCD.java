package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    public static void startGameGCD() {

        String exercise = "Find the greatest common divisor of given numbers.";
        String[] question = new String[Engine.numbersOfRounds];
        String[] correctAnswer = new String[Engine.numbersOfRounds];

        for (int i = 0; i < Engine.numbersOfRounds; i++) {
            int randomNum1 = Engine.getRandomNumber(1, 100);
            int randomNum2 = Engine.getRandomNumber(1, 100);
            question[i] = randomNum1 + " " + randomNum2;
            correctAnswer[i] = Integer.toString(getGreatestCommonDivisor(randomNum1, randomNum2));
        }
        Engine.evenParity(exercise, question, correctAnswer);
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
