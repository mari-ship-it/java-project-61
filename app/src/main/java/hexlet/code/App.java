package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
        Scanner input = new Scanner(System.in);
        System.out.print("Your choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                Cli.sayHelloByName();
                input.close();
                break;
            case 2:
                Cli.sayHelloByName();
                Even.evenParity();
            default:
                input.close();
        }
    }
}
