package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {

    public static int numbersOfRounds = 3;

    public static void evenParity(String exercise, String[] question, String[]correctAnswer) {
        Cli.sayHelloByName();
        System.out.println(exercise);
        Scanner input = new Scanner(System.in);
        int i = 0;

        do {
            System.out.println("Question: " + question[i]);
            System.out.print("Your answer: ");
            String answer = input.nextLine();

            if (answer.equals(correctAnswer[i]) & i == 2) {
                System.out.println("Correct!\nCongratulations, " + Cli.name + "!");
            } else if (answer.equals(correctAnswer[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer[i]
                        + "'.\n" + "Let's try again, " + Cli.name + "!");
                input.close();
                break;
            }
            i++;
        } while (i < numbersOfRounds);
        input.close();
    }
    public static int getRandomNumber(int minNum, int maxNum) {
        Random random = new Random();
        return random.nextInt(minNum, maxNum);
    }
}
