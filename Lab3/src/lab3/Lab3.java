package lab3;

import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("DO you want to play rock, paper, scissors? (y/n)");
        String wantToPlay = keyboard.nextLine();

        while (wantToPlay.equalsIgnoreCase("y")) {
            System.out.println("What do you want to throw? rock, paper, scissors");
            String choice = keyboard.nextLine();

            if (choice.equalsIgnoreCase("paper")) {
                System.out.println("You win!");
            } else if (choice.equalsIgnoreCase("scissors")) {
                System.out.println("You lose!");
            } else if (choice.equalsIgnoreCase("rock")) {
                System.out.println("You tie!");
            } else {
                System.out.println("That wasn't rock, paper, or scissors");
            }
            
            System.out.println("DO you want to play again? (y/n)");
            wantToPlay = keyboard.nextLine();

        }
        
        System.out.println("Thanks for playing!");
    }

}
