package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import  hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        Scanner input = new Scanner(System.in);
        System.out.print("Your choice: ");
        String choice = input.nextLine();

        switch (choice) {
            case "1":
                Cli.renderGreeting();
                input.close();
                break;
            case "2":
                Even.launchTheGameEven();
                break;
            case "3":
                Calc.launchTheGameCalc();
                break;
            case "4":
                GCD.launchTheGameGCD();
                break;
            case "5":
                Progression.launchTheGameProgression();
                break;
            case "6":
                Prime.launchTheGamePrime();
                break;
            default:
                input.close();
        }
    }
}
