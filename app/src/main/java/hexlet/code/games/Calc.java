package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    public static void startCalcGame() {
        String exercise = "What is the result of the expression?";
        String[] question = new String[Engine.numbersOfRounds];
        String[] correctAnswer = new String[Engine.numbersOfRounds];

        for (int i = 0; i < Engine.numbersOfRounds; i++) {
            int firstNum = Engine.getRandomNumber(1, 20);
            int secondNum = Engine.getRandomNumber(1, 20);
            int operatorNum = Engine.getRandomNumber(1, 4);
            switch (operatorNum) {
                case 1:
                    question[i] = firstNum + " + " + secondNum;
                    correctAnswer[i] = Integer.toString(firstNum + secondNum);
                    break;
                case 2:
                    question[i] = firstNum + " - " + secondNum;
                    correctAnswer[i] = Integer.toString(firstNum - secondNum);
                    break;
                default:
                    question[i] = firstNum + " * " + secondNum;
                    correctAnswer[i] = Integer.toString(firstNum * secondNum);
                    break;
            }
        }
        Engine.evenParity(exercise, question, correctAnswer);
    }
}

