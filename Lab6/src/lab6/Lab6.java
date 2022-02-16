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
            System.out.println("Enter the size square you want");
            int size = Integer.parseInt(keyboard.nextLine());
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

}
