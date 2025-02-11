package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void launchTheGamePrime() {
        String exercise = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] questions = new String[Engine.MAX_NUMBERS_OF_ROUNDS];
        String[] correctAnswers = new String[Engine.MAX_NUMBERS_OF_ROUNDS];

        for (int i = 0; i < Engine.MAX_NUMBERS_OF_ROUNDS; i++) {
            int randomNum = Utils.generateRandomNumber(1, Calc.MAX_VALUE_RANDOM_NUM);
            questions[i] = Integer.toString(randomNum);

            correctAnswers[i] = randomNum < 2 || hasDivisorsOfNumber(randomNum) ? "no" : "yes";

        }
        Engine.setLogicOfGame(exercise, questions, correctAnswers);
    }

    public static boolean hasDivisorsOfNumber(int randomNum) {
        int i = 2;
        while (i < randomNum) {
            if (randomNum % i == 0) {
                return  true;
            }
            ++i;
        }
        return false;
    }
}
