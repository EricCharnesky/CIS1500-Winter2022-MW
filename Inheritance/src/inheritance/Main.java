package inheritance;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the name of an item to buy");
        String name = keyboard.nextLine();

        System.out.println("Enter the SKU of " + name);
        String sku = keyboard.nextLine();

        System.out.println("Enter the quantity to purchase of " + name);
        int quantity = Integer.parseInt(keyboard.nextLine());

        System.out.println("Enter the price of " + name);
        double price = Double.parseDouble(keyboard.nextLine());

        Item item = new Item(name, sku, quantity, price);

        printItem(item);

        System.out.println("Enter the name of an item to buy");
        name = keyboard.nextLine();

        System.out.println("Enter the SKU of " + name);
        sku = keyboard.nextLine();

        System.out.println("Enter the quantity to purchase of " + name);
        quantity = Integer.parseInt(keyboard.nextLine());

        System.out.println("Enter the price of " + name);
        price = Double.parseDouble(keyboard.nextLine());

        System.out.println("Enter the tax rate for " + name);
        double taxRate = Double.parseDouble(keyboard.nextLine());

        TaxableItem taxableItem = new TaxableItem(name, sku, quantity, price, taxRate);

        printItem(taxableItem);
    }

    public static void printItem(Item item) {
        System.out.println("Name: " + item.getName());
        System.out.println("SKU: " + item.getSku());
        System.out.println("Quantity: " + item.getQuantity());
        System.out.println("Price: " + item.getPrice());

        // at runtime, you'll get the overridden version if you pass a taxable item
        System.out.println("Total Price: $" + item.getTotalPrice());
    }
}
