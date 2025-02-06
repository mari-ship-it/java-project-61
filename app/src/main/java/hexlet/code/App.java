package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
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
            case 5:
                Progression.startProgressionGame();
                break;
            case 6:
                Prime.startGamePrime();
                break;
            default:
                input.close();
        }
    }
}
