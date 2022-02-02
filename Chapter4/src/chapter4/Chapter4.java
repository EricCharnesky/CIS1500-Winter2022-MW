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

    }

}
