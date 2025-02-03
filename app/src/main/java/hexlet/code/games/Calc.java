package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    public static void startCalcGame() {
        String exercise = "What is the result of the expression?";
        String[] question = new String[Engine.numbersOfRounds];
        String[] correctAnswer = new String[Engine.numbersOfRounds];

        for (int i = 0; i < Engine.numbersOfRounds; i++) {
            int randomNum1 = Engine.getRandomNumber(1, 20);
            int randomNum2 = Engine.getRandomNumber(1, 20);
            int operatorNum = Engine.getRandomNumber(1, 4);
            switch (operatorNum) {
                case 1:
                    question[i] = randomNum1 + " + " + randomNum2;
                    correctAnswer[i] = Integer.toString(randomNum1 + randomNum2);
                    break;
                case 2:
                    question[i] = randomNum1 + " - " + randomNum2;
                    correctAnswer[i] = Integer.toString(randomNum1 - randomNum2);
                    break;
                default:
                    question[i] = randomNum1 + " * " + randomNum2;
                    correctAnswer[i] = Integer.toString(randomNum1 * randomNum2);
                    break;
            }
        }
        Engine.evenParity(exercise, question, correctAnswer);
    }
}

