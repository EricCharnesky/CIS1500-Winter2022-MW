package lab5;

import java.util.Scanner;

public class Lab5 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int score = askUserForValueAndValidateRange("Please enter your score 1-100", 1, 100);

        int average = askUserForValueAndValidateRange("Please enter the average score 1-100", 1, 100);

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
    
    public static int askUserForValueAndValidateRange(String prompt, int min, int max){
        Scanner keyboard = new Scanner(System.in);
        int value;
        do {
            System.out.println(prompt);
            value = Integer.parseInt(keyboard.nextLine());
        } while (value < min || value > max);
        return value;
    }

}
