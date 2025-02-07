package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {

    public static int maxNumbersOfRounds = 3;

    public static void setLogicOfGame(String exercise, String[] questions, String[] correctAnswers) {
        Cli.renderGreeting();
        System.out.println(exercise);
        Scanner input = new Scanner(System.in);
        int i = 0;

        do {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            String answer = input.nextLine();

            if (answer.equals(correctAnswers[i]) & i == 2) {
                System.out.println("Correct!\nCongratulations, " + Cli.userName + "!");
            } else if (answer.equals(correctAnswers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswers[i]
                        + "'.\n" + "Let's try again, " + Cli.userName + "!");
                input.close();
                break;
            }
            i++;
        } while (i < maxNumbersOfRounds);
        input.close();
    }
    public static int generateRandomNumber(int minNum, int maxNum) {
        Random random = new Random();
        return random.nextInt(minNum, maxNum);
    }
}
