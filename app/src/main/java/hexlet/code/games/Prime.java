package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void launchTheGamePrime() {
        String exercise = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] questions = new String[Engine.getMaxNumbersOfRounds()];
        String[] correctAnswers = new String[Engine.getMaxNumbersOfRounds()];

        for (int i = 0; i < Engine.getMaxNumbersOfRounds(); i++) {
            int randomNum = Engine.generateRandomNumber(1, Calc.MAX_VALUE_RANDOM_NUM);
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
