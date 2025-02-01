package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {

    public static void evenParity() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int winningNumOfGames = 3;
        int i = 0;
        String answer;
        String correctAnswer;

        do {
            int randomNumber = random.nextInt(100);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            answer = input.nextLine();
            correctAnswer = randomNumber % 2 == 0 ? "yes" : "no";
            i++;

            if (answer.equals(correctAnswer) & i == winningNumOfGames) {
                System.out.println("Correct!\nCongratulations, " + Cli.name + "!");
            } else if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no'.\n"
                        + "Let's try again, " + Cli.name + "!");
            }

        } while (i < winningNumOfGames & answer.equals(correctAnswer));
        input.close();
    }
}
