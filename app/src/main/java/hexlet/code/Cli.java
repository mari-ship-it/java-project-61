package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void sayHelloByName() {
        System.out.println("Welcome to the Brain Games!");
        Scanner input = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
