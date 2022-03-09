package chapter7.classes;

import java.util.Scanner;

public class Chapter7Classes {

    public static void main(String[] args) {
        // type, variable name, = , new, Constructor/Class Name()
        //Tree mapleTree = new Tree();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the species of your tree");
        String species = keyboard.nextLine();

        System.out.println("Enter the bark color of your tree");
        String treeBarkColor = keyboard.nextLine();

        System.out.println("Enter the height in meters of your tree");
        double heightInMeters = Double.parseDouble(keyboard.nextLine());

        Tree mapleTree = new Tree(species, treeBarkColor, heightInMeters);
//        mapleTree.setSpecies(species);
//        mapleTree.setBarkColor(treeBarkColor);
//        mapleTree.setHeightInMeters(heightInMeters);

        printTree(mapleTree);

        Tree pineTree = new Tree("douglas fir", "brown", 2);
        
        // this crashes if we use the default constructor that sets strings to null
        if ( pineTree.getBarkColor().equalsIgnoreCase("brown")){
            System.out.println("It's a brown tree!");
        }
        
        // don't need to call separate the separate set methods when we use the parameterized constructor
//        pineTree.setBarkColor("brown");
//        pineTree.setSpecies("douglas fir");
//        pineTree.setHeightInMeters(2);

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
