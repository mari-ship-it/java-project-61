package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    protected static final int MAX_VALUE_RANDOM_NUM = 100;
    private static final int MAX_VALUE_FOR_THE_COMPARISON_OPERATOR = 4;

    public static void launchTheGameCalc() {
        String exercise = "What is the result of the expression?";
        String[] questions = new String[Engine.MAX_NUMBERS_OF_ROUNDS];
        String[] correctAnswers = new String[Engine.MAX_NUMBERS_OF_ROUNDS];

        for (int i = 0; i < Engine.MAX_NUMBERS_OF_ROUNDS; i++) {
            int firstNum = Utils.generateRandomNumber(1, MAX_VALUE_RANDOM_NUM);
            int secondNum = Utils.generateRandomNumber(1, MAX_VALUE_RANDOM_NUM);
            int operatorNum = Utils.generateRandomNumber(1, MAX_VALUE_FOR_THE_COMPARISON_OPERATOR);
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
