package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static void startEvenGame() {
        String exercise = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] question = new String[Engine.numbersOfRounds];
        String[] correctAnswer = new String[Engine.numbersOfRounds];

        for (var i = 0; i < Engine.numbersOfRounds; i++) {
            int randomNum = Engine.getRandomNumber(1, 100);
            String strRandomNum = Integer.toString(randomNum);
            String corrAnswer = randomNum % 2 == 0 ? "yes" : "no";
            question[i] = strRandomNum;
            correctAnswer[i] = corrAnswer;
        }

        Engine.evenParity(exercise, question, correctAnswer);
    }
}

