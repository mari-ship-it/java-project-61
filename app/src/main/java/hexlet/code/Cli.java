package hexlet.code;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Cli {

    private static  String userName;

    public static String getUserName() {
        return userName;
    }

    public static void renderGreeting() {
        System.out.println("\nWelcome to the Brain Games!");
        Scanner input = new Scanner(System.in);
        System.out.print("May I have your name? ");
        Cli.userName = StringUtils.capitalize(input.nextLine());
        System.out.println("Hello, " + Cli.userName + "!");
    }
}
