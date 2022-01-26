package chapter3;

import java.util.Scanner;

public class Chapter3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Happy Wednesday!");

        byte reallySmallNumbers = 7; // -128 -> 127

        short smallerNumber = 32_000; // -32,768 -> 32,767

        int regularNumbers = 42; // -2,147,483,648 -> 2,147,483,647

        // requires an L at the end to tell java it's a long
        long reallyLargWholeNumbers = 9_223_372_036_854_775_807L;

        float smallerNumbersWithDecimals = 7.7f; // use an F to tell java you want a float

        double numberWithDecimalPlaces = 7.7; // 8 bytes

        char singleCharacter = 'E';

        char upperCaseA = 65;

        char firstLetter = 69;
        char secondLetter = 114;
        char thirdLetter = 105;
        char fourthLetter = 99;

        System.out.print(firstLetter);
        System.out.print(secondLetter);
        System.out.print(thirdLetter);
        System.out.println(fourthLetter);
        
        // this will add the number values
        System.out.println(firstLetter + secondLetter + thirdLetter + fourthLetter);

        // if you add strings between it should work
        System.out.println(firstLetter + "" + secondLetter + "" + thirdLetter + "" + fourthLetter);

        
        firstLetter = (char)(firstLetter + 1);
        secondLetter += 1;
        thirdLetter++; // post incriment operator
        ++fourthLetter; // pre incriment operator
        
        System.out.println(firstLetter + "" + secondLetter + "" + thirdLetter + "" + fourthLetter);

        // final variables can only be assigned once
        final int SPEED_OF_LIGHT_IN_METERS_PER_SECOND = 299_792_458;
        
        // SPEED_OF_LIGHT_IN_METERS_PER_SECOND = 300_000_000;
        
        
        // integer division in java - int / int will give and int
         // any decimal remainder is gone
        System.out.println("10 / 3 == " + 10 / 3);
        
        // % is modulus, gives the reminder of the division
        System.out.println("10 / 3 == " + 10 / 3 + " reminder " + 10 % 3);
    
        
        // if either operand is a double, the result will be a double
        System.out.println("10.0 / 3 == " + 10.0 / 3 );
        
        System.out.println("10 / 3 rounded up == " + Math.ceil(10 / 3));
        System.out.println("10.0 / 3 rounded up == " + Math.ceil(10.0 / 3));
        
        // Math.random() * max value + 1 to get 1-max value
        System.out.println("Random number 1-10: " + Math.floor(Math.random() * 10 + 1));
        
        
        
        // ask the user if they want to play a game
        
        // while their answer is yes, keep looping
        
          // ask them how high of a number they want to guess
          
          // generate a random number 1-that number
          
          // count the number of guesses it takes them to guess the number
          
          // ask them to guess
          // loop as long as their guess is NOT correct
            // tell them too high or too low
            // if the guess was < the number - loo low
            // else - too high
            // make sure you are count the number of guesses
            // have them guess again
          
        // ask if they want to play again 
        
    }

}
