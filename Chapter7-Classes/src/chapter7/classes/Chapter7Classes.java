package chapter7.classes;

import java.util.Scanner;

public class Chapter7Classes {

    public static void main(String[] args) {
        // type, variable name, = , new, Constructor/Class Name()
        Tree mapleTree = new Tree();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the species of your tree");
        String species = keyboard.nextLine();

        System.out.println("Enter the bark color of your tree");
        String treeBarkColor = keyboard.nextLine();

        System.out.println("Enter the height in meters of your tree");
        double heightInMeters = Double.parseDouble(keyboard.nextLine());

        mapleTree.setSpecies(species);
        mapleTree.setBarkColor(treeBarkColor);
        mapleTree.setHeightInMeters(heightInMeters);

        printTree(mapleTree);

        Tree pineTree = new Tree();
        pineTree.setBarkColor("brown");
        pineTree.setSpecies("douglas fir");
        pineTree.setHeightInMeters(2);

        printTree(pineTree);
        
        
        pineTree.chopDown();
        
        printTree(pineTree);
    }

    public static void printTree(Tree tree) {
        System.out.println("Your tree species is " + tree.getSpecies());
        System.out.println("Your tree bark color is " + tree.getBarkColor());
        System.out.println("Your tree height in meters is " + tree.getHeightInMeters());

    }

}
