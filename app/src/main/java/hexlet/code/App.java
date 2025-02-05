package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n0 - Exit");
        Scanner input = new Scanner(System.in);
        System.out.print("Your choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                Cli.sayHelloByName();
                input.close();
                break;
            case 2:
                Even.startEvenGame();
                break;
            case 3:
                Calc.startCalcGame();
                break;
            case 4:
                GCD.startGameGCD();
                break;
            default:
                input.close();
        }
    }
}
