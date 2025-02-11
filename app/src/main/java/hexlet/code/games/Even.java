package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static void launchTheGameEven() {
        String exercise = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] questions = new String[Engine.MAX_NUMBERS_OF_ROUNDS];
        String[] correctAnswers = new String[Engine.MAX_NUMBERS_OF_ROUNDS];

        for (var i = 0; i < Engine.MAX_NUMBERS_OF_ROUNDS; i++) {
            int randomNum = Utils.generateRandomNumber(1, Calc.MAX_VALUE_RANDOM_NUM);
            String strRandomNum = Integer.toString(randomNum);
            String corrAnswer = randomNum % 2 == 0 ? "yes" : "no";
            questions[i] = strRandomNum;
            correctAnswers[i] = corrAnswer;
        }

        Engine.setLogicOfGame(exercise, questions, correctAnswers);
    }
}
