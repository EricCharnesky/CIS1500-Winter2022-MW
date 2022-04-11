package project4;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Project4 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String choice = "";

        while (!choice.equalsIgnoreCase("4")) {

            System.out.println("Do you want to:");
            System.out.println("1 - Manage Shows");
            System.out.println("2 - Sell Tickets");
            System.out.println("3 - Print Report for show");
            System.out.println("4 - Quit");

            choice = keyboard.nextLine();

            // we know this might overwrite a file, too bad?
            if (choice.equalsIgnoreCase("1")) {
                System.out.println("Enter the name of the show: ");
                String showName = keyboard.nextLine();

                System.out.println("Enter the number of tickets you are going to sell for " + showName);
                int numberOfTickets = Integer.parseInt(keyboard.nextLine());

                ArrayList<Ticket> tickets = new ArrayList<>();
                for (int ticketNumber = 1; ticketNumber <= numberOfTickets; ticketNumber++) {
                    Ticket ticket = new Ticket("", ticketNumber, 0);
                    tickets.add(ticket);
                }

                writeTicketsToFile(showName, tickets);

            } else if (choice.equalsIgnoreCase("2")) {
                System.out.println("Enter the show name");
                String showName = keyboard.nextLine();
                ArrayList<Ticket> tickets = readTickets(showName);

                System.out.println("We have " + tickets.size() + " number of tickets for that show, which ticket do you want?");

                int ticketNumber = Integer.parseInt(keyboard.nextLine());

                // ticketNumber - 1 should be the index of the ticket
                if (ticketNumber < 0 || ticketNumber > tickets.size() || tickets.get(ticketNumber - 1).getConfirmationCode() != 0) {
                    System.out.println("That ticket isn't for sale, please try again");
                } else {
                    System.out.println("That ticket is available, please enter your name: ");
                    String guestName = keyboard.nextLine();
                    tickets.get(ticketNumber - 1).setGuestName(guestName);
                    System.out.println("Your confirmation code is " + tickets.get(ticketNumber - 1).generateConfirmationCode());
                    writeTicketsToFile(showName, tickets);
                }

            } else if (choice.equalsIgnoreCase("3")) {

                System.out.println("Enter the show name");
                String showName = keyboard.nextLine();
                ArrayList<Ticket> tickets = readTickets(showName);

                for (Ticket ticket : tickets) {
                    System.out.println("Ticket #: " + ticket.getTicketNumber() +
                            " Guest Name: " + ticket.getGuestName() +
                            " Confirmation Code: " + ticket.getConfirmationCode());
                }
            }
        }

    }

    private static void writeTicketsToFile(String showName, ArrayList<Ticket> tickets) {
        try {
            // opens the file - it will create a file if it doesn't exist

            // print writer will OVERWRITE any existing file
            PrintWriter fileOutput =
                    new PrintWriter(new BufferedWriter(new FileWriter(showName + ".txt")));

            // write to the file
            for (Ticket ticket : tickets) {
                fileOutput.println(ticket.getStringForFile());
            }

            // close the file
            fileOutput.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private static ArrayList<Ticket> readTickets(String showName) {

        File file = new File(showName + ".txt");

        ArrayList<Ticket> tickets = new ArrayList<>();

        if (file.exists()) {
            try {
                // opens the file for reading
                BufferedReader inputFile = new BufferedReader(new FileReader(file));

                // read the file
                String line = inputFile.readLine();
                while (line != null) { // at the end of the file, line becomes null
                    if (!line.isEmpty()) { // avoid the last blank line
                        String[] parts = line.split("\\|");
                        String name = parts[0];
                        int ticketNumber = Integer.parseInt(parts[1]);
                        int confirmationCode = Integer.parseInt(parts[2]);
                        Ticket ticket = new Ticket(name, ticketNumber, confirmationCode);
                        tickets.add(ticket);
                        line = inputFile.readLine(); // read the next line
                    }
                }

                // close the file
                inputFile.close();


            } catch (IOException ex) {
                System.out.println(ex);
            }

        } else {
            System.out.println("Unable to find tickets for " + showName);
        }

        return tickets;
    }
}
