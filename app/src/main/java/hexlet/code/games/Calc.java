package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    protected static final int MAX_VALUE_RANDOM_NUM = 100;

    public static void launchTheGameCalc() {
        String exercise = "What is the result of the expression?";
        String[] questions = new String[Engine.getMaxNumbersOfRounds()];
        String[] correctAnswers = new String[Engine.getMaxNumbersOfRounds()];

        for (int i = 0; i < Engine.getMaxNumbersOfRounds(); i++) {
            int firstNum = Engine.generateRandomNumber(1, MAX_VALUE_RANDOM_NUM);
            int secondNum = Engine.generateRandomNumber(1, MAX_VALUE_RANDOM_NUM);
            int operatorNum = Engine.generateRandomNumber(1, 4);
            switch (operatorNum) {
                case 1:
                    questions[i] = firstNum + " + " + secondNum;
                    correctAnswers[i] = Integer.toString(firstNum + secondNum);
                    break;
                case 2:
                    questions[i] = firstNum + " - " + secondNum;
                    correctAnswers[i] = Integer.toString(firstNum - secondNum);
                    break;
                default:
                    questions[i] = firstNum + " * " + secondNum;
                    correctAnswers[i] = Integer.toString(firstNum * secondNum);
                    break;
            }
        }
        Engine.setLogicOfGame(exercise, questions, correctAnswers);
    }
}
