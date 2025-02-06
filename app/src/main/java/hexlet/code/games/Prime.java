package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void startGamePrime() {
        String exercise = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] question = new String[Engine.numbersOfRounds];
        String[] correctAnswer = new String[Engine.numbersOfRounds];

        for (int i = 0; i < Engine.numbersOfRounds; i++) {
            int randomNum = Engine.getRandomNumber(1, 100);
            question[i] = Integer.toString(randomNum);

            if (randomNum < 2 || isDivisorsOfNumber(randomNum)) {
                correctAnswer[i] = "no";
            } else {
                correctAnswer[i] = "yes";
            }
        }
        Engine.evenParity(exercise, question, correctAnswer);
    }

    public static boolean isDivisorsOfNumber(int randomNum) {
        for (int i = 2; i < randomNum; i++) {
            if (randomNum % i == 0) {
                return true;
            }
        }
        return false;
    }
}
