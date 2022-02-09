package lab5;

import java.util.Scanner;

public class Lab5 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int score = 0;
        while (score < 1 || score > 100) {
            System.out.println("Please enter your score 1-100");
            score = Integer.parseInt(keyboard.nextLine());
        }

        int average = 0;
        while (average < 1 || average > 100) {
            System.out.println("Please enter the average score 1-100");
            average = Integer.parseInt(keyboard.nextLine());
        }

        if (score > average) {
            System.out.println("You got an A!");
        } else if (average < 90 && average >= 80 && average - score <= 10) {
            System.out.println("You got an B!");
        } else if ((average < 80 && average >= 70 && average - score <= 10)
                || (average < 70 && score > 50)) {
            System.out.println("You got an C!");
            
        // combined with above C instead
        //}else if (  average < 70 && score > 50 )
            //{
            //    System.out.println("You got an C!");
        } else {
            System.out.println("You got your score: " + score);
        }

    }

}
