package project1;

import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = keyboard.nextLine();

        System.out.println(name + ", how many people are coming to the party?");
        int numberOfPeople = Integer.parseInt(keyboard.nextLine());

        System.out.println(name + ", what are you serving? hot dogs, mini quiche, or dumplings");
        String choice = keyboard.nextLine();

        if (choice.equalsIgnoreCase("hot dogs")) {
            
            int numberOfPacks = (int) Math.ceil(numberOfPeople / 4.0);
            System.out.println(name + ", you need to buy " + numberOfPacks
                    + " packs of hot dogs and buns");
            
        } else if (choice.equalsIgnoreCase("mini quiche")) {
           
            int numberOfQuiches = (int) Math.ceil(numberOfPeople / 6.0);
            int numberOfDips = (int) Math.ceil(numberOfPeople / 10.0);
            System.out.println(name + ", you need to buy " + numberOfQuiches
                    + " packs of mini quiche and " + numberOfDips
                    + " packs of dip");
            
        } else if (choice.equalsIgnoreCase("dumplings")) {
           
            int bagsOfDumplings = (int) Math.ceil(numberOfPeople / 8.0);
            int numberOfDips = (int) Math.ceil(numberOfPeople / 12.0);
            System.out.println(name + ", you need to buy " + bagsOfDumplings
                    + " bags of dumplings and " + numberOfDips
                    + " packs of spicy dip and regular dip");
            
        } else {
            System.out.println(name + ", I don't know that, try again!");
        }
    }

}
