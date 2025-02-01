package hexlet.code;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Cli {

    public static String name;

    public static void sayHelloByName() {
        System.out.println("\nWelcome to the Brain Games!");
        Scanner input = new Scanner(System.in);
        System.out.print("May I have your name? ");
        name = StringUtils.capitalize(input.nextLine());
        System.out.println("Hello, " + name + "!");
        input.close();
    }
}
