package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    public static void launchTheGameCalc() {
        String exercise = "What is the result of the expression?";
        String[] questions = new String[Engine.maxNumbersOfRounds];
        String[] correctAnswers = new String[Engine.maxNumbersOfRounds];

        for (int i = 0; i < Engine.maxNumbersOfRounds; i++) {
            int firstNum = Engine.generateRandomNumber(1, 20);
            int secondNum = Engine.generateRandomNumber(1, 20);
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

