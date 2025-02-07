package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static void launchTheGameEven() {
        String exercise = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] questions = new String[Engine.maxNumbersOfRounds];
        String[] correctAnswers = new String[Engine.maxNumbersOfRounds];

        for (var i = 0; i < Engine.maxNumbersOfRounds; i++) {
            int randomNum = Engine.generateRandomNumber(1, 100);
            String strRandomNum = Integer.toString(randomNum);
            String corrAnswer = randomNum % 2 == 0 ? "yes" : "no";
            questions[i] = strRandomNum;
            correctAnswers[i] = corrAnswer;
        }

        Engine.setLogicOfGame(exercise, questions, correctAnswers);
    }
}

