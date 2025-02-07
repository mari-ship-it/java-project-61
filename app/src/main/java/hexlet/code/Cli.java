package hexlet.code;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Cli {

    public static String userName;

    public static void renderGreeting() {
        System.out.println("\nWelcome to the Brain Games!");
        Scanner input = new Scanner(System.in);
        System.out.print("May I have your name? ");
        userName = StringUtils.capitalize(input.nextLine());
        System.out.println("Hello, " + userName + "!");
    }
}
