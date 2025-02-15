package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    public static void launchTheGameCalc() {

        final int maxValueRandomNum = 100;
        final int minValueRandomNum = 0;
        final String[] operators = new String[]{"+", "-", "*"};
        final String exercise = "What is the result of the expression?";
        String[][] roundsData = new String[Engine.MAX_NUMBERS_OF_ROUNDS][2];
        int i = 0;

        while (i < Engine.MAX_NUMBERS_OF_ROUNDS) {

            final int firstNum = Utils.generateRandomNumber(minValueRandomNum, maxValueRandomNum);
            final int secondNum = Utils.generateRandomNumber(minValueRandomNum, maxValueRandomNum);
            final int operatorNum = Utils.generateRandomNumber(minValueRandomNum, operators.length);

            roundsData[i][Engine.QUESTION_INDEX] = firstNum + " " + operators[operatorNum] + " " + secondNum;
            roundsData[i][Engine.ANSWER_INDEX] = Integer.toString(calculate(operators[operatorNum],
                    firstNum, secondNum));
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
