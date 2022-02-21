package lab7;

import java.util.Scanner;

public class Lab7 {

    // from https://github.com/EricCharnesky/CIS1500-Winter2022-MW/blob/main/Lab6/src/lab6/Lab6.java
    public static void main(String[] args) {
        String shape = askForAShape();

        if (shape.equalsIgnoreCase("square")) {
            int size = askForAnInt("Enter the size square you want");
            printSquare(size);

        } else if (shape.equalsIgnoreCase("rectangle")) {
            int length = askForAnInt("Enter the length rectangle you want");
            int width = askForAnInt("Enter the width rectangle you want");

            printRectangle(length, width);

        } else if (shape.equalsIgnoreCase("right triangle")) {
            int size = askForAnInt("Enter the size triangle you want");

            printRightTriangle(size);
        } else if (shape.equalsIgnoreCase("equilateral triangle")) {
            int base = askForAnOddInt("Enter an odd base size of an equilateral triangle");

            printEquilateralTriangle(base);
        }

    }

    public static int askForAnOddInt(String prompt) {
        int value = askForAnInt(prompt);

        while (value % 2 == 0) {
            value = askForAnInt(prompt);
        }

        return value;
    }

    public static int askForAnInt(String prompt) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(prompt);
        int value = Integer.parseInt(keyboard.nextLine());
        return value;
    }

    public static String askForAShape() {
        Scanner keyboard = new Scanner(System.in);
        String shape = "";

        while (!shape.equalsIgnoreCase("square")
                && !shape.equalsIgnoreCase("rectangle")
                && !shape.equalsIgnoreCase("right triangle")
                && !shape.equalsIgnoreCase("equilateral triangle")) {
            System.out.println("What shape do you want to print, square"
                    + ", rectangle, right triangle, equilateral triangle");
            shape = keyboard.nextLine();
        }

        return shape;
    }

    public static void printSquare(int size) {
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printRectangle(int length, int width) {
        for (int row = 0; row < width; row++) {
            for (int column = 0; column < length; column++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printRightTriangle(int size) {
        for (int row = 0; row < size; row++) {
            for (int column = 0; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printEquilateralTriangle(int base) {
        int spaces = base / 2; // integer division here is good
        int stars = 1;

        // you could do this as a for loop, but it's 'busy'
        //for ( int spaces = base / 2; stars < base; stars += 2){
        // even worse
        //for ( int spaces = base / 2, stars = 1; stars < base; stars += 2, spaces--)
        while (stars <= base) {
            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < stars; star++) {
                System.out.print("*");
            }
            System.out.println("");
            stars += 2;
            spaces -= 1;
        }

    }

}
