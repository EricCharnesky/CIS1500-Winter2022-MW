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
        myFavoriteNumber =+ 10; // sets it to positive 10
        
        System.out.println(myFavoriteNumber);
        
        // getting user input
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = keyboard.nextLine();
        
        System.out.println("Hi there " + name);
        
        System.out.println(name + " please enter a number to add: ");
        int firstNumber = Integer.parseInt( keyboard.nextLine() );
        
        System.out.println(name + " please enter another number to add: ");
        int secondNumber = Integer.parseInt( keyboard.nextLine() );
        
        System.out.println("Your numbers added together are: " 
                + (firstNumber + secondNumber));
        
        
        System.out.println("Enter some value with a decimal place");
        double someValue = Double.parseDouble( keyboard.nextLine() );

    }

}
