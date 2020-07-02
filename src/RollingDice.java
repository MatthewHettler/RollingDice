import java.util.Random;
import java.util.Scanner;

public class RollingDice {

    public static void main(String[] args) {

        // Random coolNumberBro = new Random();
        // int x = coolNumberBro.nextInt(6) + 1;
        System.out.println("Hello there! What is your name?");

        Scanner a = new Scanner(System.in);
        String name = a.nextLine();

        System.out.println("Glad to meet you " + name + "!");

        System.out.println("Would you like to roll the dice!? Type: Yes/No)");

        Scanner diceRollQuestion = new Scanner(System.in);
        String newQuestion = diceRollQuestion.nextLine();

        // if (newQuestion.equalsIgnoreCase("yes")){
        //     System.out.println("You rolled a: " + x);
        // } else {
        //     System.out.println("Ok, see you next time!");
        // }

        while (newQuestion.equalsIgnoreCase("yes")) {
            Random coolNumberBro = new Random();
            int x = coolNumberBro.nextInt(6) + 1;
            System.out.println("You have rolled a: " + x);
            System.out.println("Do you wish to roll again? Type: yes/no");
            Scanner scanner = new Scanner(System.in);
            if (!scanner.next().equalsIgnoreCase("yes")){
                break;
            }
        }
        System.out.println("Thanks for playing!");

    } 
}