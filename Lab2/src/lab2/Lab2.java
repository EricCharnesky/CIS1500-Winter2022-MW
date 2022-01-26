
package lab2;

import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Hi there, what's your name?");
        String name = keyboard.nextLine();
        
        System.out.println(name + ", how many hours did you work?");
        double hoursWorked = Double.parseDouble(keyboard.nextLine());
        
        System.out.println(name + ", how much do you get paid per hour?");
        double hourlyPayRate = Double.parseDouble(keyboard.nextLine());
        
        double grossPay = hourlyPayRate * hoursWorked;
        double netPay = grossPay * .9;
        
        System.out.println(name + ", your gross pay is: $" + grossPay);
        System.out.println(name + ", your esimated net pay is: $" + netPay);
    }
    
}
