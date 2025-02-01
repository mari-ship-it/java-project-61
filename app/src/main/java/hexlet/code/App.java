package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "0 - Exit");
        Scanner input = new Scanner(System.in);
        System.out.print("Your choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                Cli.sayHelloByName();
                input.close();
            default:
                input.close();
        }
    }
}
