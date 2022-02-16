package lab6;

import java.util.Scanner;

public class Lab6 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String shape = "";

        while (!shape.equalsIgnoreCase("square")
                && !shape.equalsIgnoreCase("rectangle")
                && !shape.equalsIgnoreCase("triangle")) {
            System.out.println("What shape do you want to print, square"
                    + ", rectangle, triangle");
            shape = keyboard.nextLine();
        }
        
        if ( shape.equalsIgnoreCase("square")){
            String prompt = "Enter the size square you want";
            int size = askForAnInt(prompt);
            for ( int row = 0; row < size; row++ )
            {
                for ( int column = 0; column < size; column++){
                    System.out.print("*");
                }
                System.out.println("");
            }
            
        } else if ( shape.equalsIgnoreCase("rectangle")){
            System.out.println("Enter the length rectangle you want");
            int length = Integer.parseInt(keyboard.nextLine());
            System.out.println("Enter the width rectangle you want");
            int width = Integer.parseInt(keyboard.nextLine());
            
            for ( int row = 0; row < width; row++ )
            {
                for ( int column = 0; column < length; column++){
                    System.out.print("*");
                }
                System.out.println("");
            }
            
        } else if (shape.equalsIgnoreCase("triangle")){
            System.out.println("Enter the size triangle you want");
            int size = Integer.parseInt(keyboard.nextLine());
            
            for ( int row = 0; row < size; row++ )
            {
                for ( int column = 0; column <= row; column++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }

    }
    
    public static int askForAnInt(String prompt){
        Scanner keyboard = new Scanner(System.in);
        // strings are Immuatable - they can't change
        // any 'changes' becomes a new string in memory
        prompt = prompt.toUpperCase();  // creates a new string and points prompt to it
        // doesn't change the string stored in memory in main
        System.out.println(prompt);
        int value = Integer.parseInt(keyboard.nextLine());
        return value;
    }

}
