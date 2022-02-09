
package chapter5.methods;

import java.util.Scanner;

public class Chapter5Methods {

    public static void main(String[] args) {
        String play = askTheUserIfTheyWantToPlay();

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

            play = askTheUserIfTheyWantToPlay();
        }

        printHaveANiceDay();
    }
    
    // void methods don't return values, they just run
    public static void printHaveANiceDay(){
        System.out.println("Have a great snow day!");
        System.out.println("Enjoy the sunshine!");
        System.out.println("Are you going to go sledding?");
    }
    
    // if it isn't void, tell the java what type of value is going to be returned
    public static String askTheUserIfTheyWantToPlay(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Do you want to play a game? (y/n)");
        String play = keyboard.nextLine();
        return play;
    }
    
    public static int askHowHighToGuess(){
        System.out.println("How high of a number do you want to guess?");
            int highestNumber = Integer.parseInt(keyboard.nextLine());
            return highestNumber;
    }
    
}
