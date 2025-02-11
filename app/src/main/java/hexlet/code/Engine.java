package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int MAX_NUMBERS_OF_ROUNDS = 3;
    public static final int QUESTION_INDEX = 0;
    public static final int ANSWER_INDEX = 1;

    public static void setLogicOfGame(String exercise, String[][] roundsData) {
        Cli.renderGreeting();
        System.out.println(exercise);
        Scanner input = new Scanner(System.in);
        int i = 0;

        do {
            System.out.println("Question: " + roundsData[i][QUESTION_INDEX]);
            System.out.print("Your answer: ");
            String answer = input.nextLine();

            if (answer.equals(roundsData[i][ANSWER_INDEX]) & i == 2) {
                System.out.println("Correct!\nCongratulations, " + Cli.getUserName() + "!");
            } else if (answer.equals(roundsData[i][ANSWER_INDEX])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + roundsData[i][ANSWER_INDEX] + "'.\n" + "Let's try again, " + Cli.getUserName() + "!");
                input.close();
                break;
            }
            i++;
        } while (i < MAX_NUMBERS_OF_ROUNDS);
        input.close();
    }
}
