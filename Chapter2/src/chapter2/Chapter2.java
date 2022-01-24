package chapter2;

import java.util.Scanner;

public class Chapter2 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hi there!");

        int myFavoriteNumber = 42;

        System.out.println("Eric's favorite number is: " + myFavoriteNumber);

        // storing a really big number
        int reallyBigNumber = Integer.MAX_VALUE;

        System.out.println(reallyBigNumber);

        // adding to the max int value is bad
        System.out.println(reallyBigNumber + 1);

        double numberWithADecmial = 7.7;

        float ericIsNotAFanOfFloat = 7.7f; // add the F for float

        long reallyBigIntegerValue = 111_111_111_111_111L; // add an L for long

        char myFirstInitial = 'E'; // apotrophe, not quotes

        String myName = "Eric Charnesky"; // quotes for strings

        System.out.println(myName + "'s favorite number is "
                + myFavoriteNumber);
        System.out.println(myName + "'s first initial is: " + myFirstInitial);

        // does arithmetic on the right first, then assigns to the left
        myFavoriteNumber = myFavoriteNumber + 10;

        myFavoriteNumber = 5 + (32 * 10) / 2 - 123;

        // order of operations, left to right for same level of precendence
        int anotherNumber = 10 / 2 * 5;

        // shortcut for: myFavoriteNumber = myFavoriteNumber + 10;
        myFavoriteNumber += 10;

        // not the same as
        myFavoriteNumber = +10; // sets it to positive 10

        System.out.println(myFavoriteNumber);

        // getting user input
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = keyboard.nextLine();

        System.out.println("Hi there " + name);

        System.out.println(name + " please enter a number to add: ");
        int firstNumber = Integer.parseInt(keyboard.nextLine());

        System.out.println(name + " please enter another number to add: ");
        int secondNumber = Integer.parseInt(keyboard.nextLine());

        System.out.println("Your numbers added together are: "
                + (firstNumber + secondNumber));

        System.out.println("Enter some value with a decimal place");
        double someValue = Double.parseDouble(keyboard.nextLine());

        // boolean expression or boolean value inside the ( )
        if (firstNumber > secondNumber) {
            System.out.println("more code");
            System.out.println("Your first number is bigger than the second");
        } else { // if not true option
            System.out.println("more code");
            System.out.println("Your second number is bigger than the first");
        }

        System.out.println("Do you want to make a shopping list? (y/n)");

        String choice = keyboard.nextLine();

        // when comparing Strings, you can't use ==
        if (choice.equalsIgnoreCase("y")) {
            System.out.println("Please enter an item for the list:");
            String item1 = keyboard.nextLine();

            System.out.println("Please enter a second item for the list:");
            String item2 = keyboard.nextLine();
        } // else block is optional

        System.out.println("Please enter your grade 0-100");
        int grade = Integer.parseInt(keyboard.nextLine());

        // a chain of if checks, they are mutually exclusive - 1 and only 1 will run
        if (grade >= 94) {
            System.out.println("You got an A");
        } else if (grade >= 90) {
            System.out.println("You got an A-");
        } else if (grade >= 87) {
            System.out.println("You got a B+");
        } else if (grade >= 84) {
            System.out.println("You got a B");
        } else if (grade >= 80) {
            System.out.println("You got a B-");
        } else if (grade >= 77) {
            System.out.println("You got a C+");
        } else if (grade >= 74) {
            System.out.println("You got a C");
        } else if (grade >= 70) {
            System.out.println("You got a C-");
        } else if (grade >= 67) {
            System.out.println("You got a D+");
        } else if (grade >= 64) {
            System.out.println("You got a D");
        } else { // default ( it doesn't match anything above )
            System.out.println("You got an F");
        }

        // escape sequence for "
        System.out.println("Your favorite number is \""
                + myFavoriteNumber + "\"");

        System.out.println("\tIf you want a tab \"\\t\"");

        System.out.println("You can add yor own "
                + "line breaks with \"\\n\" \n I did a line break!");

        int magicNumber = 42;

        System.out.println("Guess a number 1-100");
        int guess = Integer.parseInt(keyboard.nextLine());
        int numberOfGuesses = 1;

        // while loop runs the block, 
        // then checks if the value is true, 
        // and runs again
        while (guess != magicNumber) {  // make sure that you are changing the value of what you are checking
            if (guess > magicNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }
            System.out.println("Guess again!");
            guess = Integer.parseInt(keyboard.nextLine());
            numberOfGuesses += 1;
        }
        // once the while condition is not true, the code continues below
        System.out.println("You guessed it in " + numberOfGuesses + " guesses!");

    }

}
