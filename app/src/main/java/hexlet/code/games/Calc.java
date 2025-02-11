package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    protected static final int MAX_VALUE_RANDOM_NUM = 100;
    private static final int MAX_VALUE_FOR_THE_COMPARISON_OPERATOR = 4;

    public static void launchTheGameCalc() {

        String exercise = "What is the result of the expression?";
        String[][] roundsData = new String[Engine.MAX_NUMBERS_OF_ROUNDS][2];

        int i = 0;
        while (i < Engine.MAX_NUMBERS_OF_ROUNDS) {
            int firstNum = Utils.generateRandomNumber(1, MAX_VALUE_RANDOM_NUM);
            int secondNum = Utils.generateRandomNumber(1, MAX_VALUE_RANDOM_NUM);
            int operatorNum = Utils.generateRandomNumber(1, MAX_VALUE_FOR_THE_COMPARISON_OPERATOR);
            String operator;

            switch (operatorNum) {
                case 1:
                    operator = "+";
                    break;
                case 2:
                    operator = "-";
                    break;
                case 3:
                    operator = "*";
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + operatorNum);
            }
            roundsData[i][Engine.QUESTION_INDEX] = firstNum + " " + operator + " " + secondNum;
            roundsData[i][Engine.ANSWER_INDEX] = Integer.toString(calculate(operator, firstNum, secondNum));
            i++;
        }
        Engine.setLogicOfGame(exercise, roundsData);
    }

    private static int calculate(String operator, int firstNum, int secondNum) {
        switch (operator) {
            case "+":
                return firstNum + secondNum;
            case "-":
                return firstNum - secondNum;
            case "*":
                return firstNum * secondNum;
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
    }
}
