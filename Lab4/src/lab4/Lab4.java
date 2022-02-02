package lab4;

import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Do you want to play a game? (y/n)");
        String play = keyboard.nextLine();

        while (play.equalsIgnoreCase("y")) {

            System.out.println("How high of a number do you want to guess?");
            int highestNumber = Integer.parseInt(keyboard.nextLine());

            int randomNumber = (int) (Math.random() * highestNumber + 1);

            System.out.println("Guess a number 1 - " + highestNumber);
            int guess = Integer.parseInt(keyboard.nextLine());
            int numberOfGuesses = 1;

            while (guess != randomNumber) {
                if (guess < randomNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
                System.out.println("Guess a number 1 - " + highestNumber);
                guess = Integer.parseInt(keyboard.nextLine());
                numberOfGuesses++;

            }

            System.out.println("Great guessing, you got it in "
                    + numberOfGuesses + " guesses!");

            System.out.println("Do you want to play again? (y/n)");
            play = keyboard.nextLine();
        }

        System.out.println("Have a great snow day!");

    }

}
