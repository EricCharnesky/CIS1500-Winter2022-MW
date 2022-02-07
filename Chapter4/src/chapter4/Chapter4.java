package chapter4;

import java.util.Scanner;

public class Chapter4 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors!");

        String play = "y";
        while (play.equalsIgnoreCase("y")) {

            int userThrow = 0; // start invalid so the loop runs

            // input validation loop
            while (userThrow < 1 || userThrow > 3) {
                System.out.println("1 for Rock");
                System.out.println("2 for Scissors");
                System.out.println("3 for Paper");
                userThrow = Integer.parseInt(keyboard.nextLine());
            }

            int computerThrow = (int) (Math.random() * 3 + 1);

            // logical operators
            //      and
            // true && true == true
            // true && false == false
            // false && true == false
            // false && false == false
            //      or
            // true || true == true
            // true || false == true
            // false || true == true
            // false || false == false
            if (computerThrow == userThrow) {
                System.out.println("Tie!");
            } else if (computerThrow == 1 && userThrow == 2
                    || computerThrow == 2 && userThrow == 3
                    || computerThrow == 3 && userThrow == 1) {
                System.out.println("You lose!");
            } else {
                System.out.println("You win!");
            }

            // old slow way
            /*
            if ( computerThrow == 1 ){
                if ( userThrow == 1 ){
                    System.out.println("Tie");
                } else if ( userThrow == 2 ){
                    System.out.println("You lose");
                } else{
                    System.out.println("You win");
                }
            }
             */
            System.out.println("Do you want to want to play again? (y/n)");
            play = keyboard.nextLine();
        }

        System.out.println("Let's play Red Light, Green Light!");

        String color = ""; // start as invalid so the loop runs

        // validation loop for strings
        while (!color.equalsIgnoreCase("green")
                && // ! is NOT - flips true and false
                !color.equalsIgnoreCase("yellow")
                && !color.equalsIgnoreCase("red")) {
            System.out.println("Please enter Red, Yellow, or Green");
            color = keyboard.nextLine();
        }
        
        // needs to be declare before the loop
        String colorDo; 
        // guaranteed to run once
        do{
            System.out.println("Please enter Red, Yellow, or Green");
            colorDo = keyboard.nextLine();
        } while (!colorDo.equalsIgnoreCase("green")
                && !colorDo.equalsIgnoreCase("yellow")
                && !colorDo.equalsIgnoreCase("red")) ; // do loops need ; after the while

        while (!colorDo.equalsIgnoreCase("green")
                && !colorDo.equalsIgnoreCase("yellow")
                && !colorDo.equalsIgnoreCase("red")) ;
        {
            System.out.println("This will never run");
        }
        
        if ( color.equals("blue")) // without curly braces, 1 line will be 'attached'
            System.out.println("That's my favorite color too!");
            System.out.println("This line always runs becuase you don't have curly braces");
        
        
        if (color.equalsIgnoreCase("green")) {
            System.out.println("GO!");
        } else if (color.equalsIgnoreCase("yellow")) {
            System.out.println("GO FASTER!");
        } else if (color.equalsIgnoreCase("red")) {
            System.out.println("STOP!");
        } else {
            System.out.println("I don't know that color");
        }

        // same as above
        switch (color.toLowerCase()) { // can't ignore case in cases
            case "green":
                System.out.println("GO!");
                break; // breaks make the switch stop
            case "yellow":
                System.out.println("Go faster!");
                break;
            case "red":
                System.out.println("STOP");
                break;
            default:
                System.out.println("I don't know that color");

        }

        System.out.println("Enter your percentage score 1-100");
        int score = Integer.parseInt(keyboard.nextLine());

        if (score >= 94) {
            System.out.println("A");
        } else if ( score >= 90 ){
            System.out.println("A-");
        }

        switch (score) {
            //case >= 94 // once it matchs a case, it runs until it finds a break
            case 100:
            case 99:
            case 98:
            case 97:
            case 96:
            case 95:
            case 94:
                System.out.println("A");
                break;
            case 93:
            case 92:
            case 91:
            case 90:
                System.out.println("A-");
                break;
        }
        
        
        int number = 0;
        while ( number < 10 ){
            System.out.println(number);
            number++; // if you forget this, it's an infinite loop
        }
        
        // same as above
        // initialize, test, update
        for ( int loopNumber = 0; loopNumber < 10; loopNumber++){
            System.out.println(loopNumber);
        }
        
        int total = 0;
        int receipt = -1;
        // senintel value - unusal value that you don't expect
        while ( receipt != 0 ){ 
            System.out.println("Enter a receipt value or 0 to stop:");
            receipt = Integer.parseInt(keyboard.nextLine());
            total += receipt;
        }
        
        System.out.println("Your total is: $" + total);

        
        int anotherTotal = 0;
        int anotherReceipt = -1;
        
        while ( true ){
            System.out.println("Enter a receipt value or 0 to stop:");
            anotherReceipt = Integer.parseInt(keyboard.nextLine());
            anotherTotal += anotherReceipt;
            if ( anotherReceipt == 0 ){
                break; // ends the loop
            }
        }
        
         System.out.println("Your total is: $" + anotherTotal);
         
         
        for ( int count = 0; count < 10; count++ ){
            if ( count % 2 == 1 ){
                continue; // go back to the loop header
            }
            System.out.println(count);
            
        }
        
        
        for ( int hour = 0; hour < 24; hour++ ){
            for ( int minute = 0; minute < 60; minute++){
                System.out.println(hour + ":" + minute);
            }
        }
        
        System.out.println("How large of a square should I print?");
        int size = Integer.parseInt(keyboard.nextLine());
        
        for ( int row = 0; row < size; row++){
            for ( int column = 0; column < size; column++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }

}
