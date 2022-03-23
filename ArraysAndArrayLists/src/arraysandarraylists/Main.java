package arraysandarraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        char[][] board = {{' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}};
        // [row index][column index]

        char currentPlayer = 'X';

        while (!gameOver(board)) {
            printBoard(board);
            System.out.println(currentPlayer + "'s turn");
            System.out.println("Enter your row #: ");
            int rowIndex = Integer.parseInt(keyboard.nextLine());
            System.out.println("Enter your column #: ");
            int columnIndex = Integer.parseInt(keyboard.nextLine());

            if (tryPlace(rowIndex, columnIndex, board, currentPlayer)){
                if ( currentPlayer == 'X'){
                    currentPlayer = 'O';
                }
                else{
                    currentPlayer = 'X';
                }
            }
        }

        printBoard(board);
    }

    public static boolean gameIsTied(char[][] board) {
        for (char[] row : board) {
            for (char spot : row) {
                if (spot == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean winByRow(char[][] board) {
        for (char[] row : board) {
            if (row[0] != ' ' && row[0] == row[1] && row[0] == row[2]) {
                return true;
            }
        }
        return false;
    }

    public static boolean winByDiagonal(char[][] board) {
        return (board[1][1] != ' ' &&
                ( (board[0][0] == board[1][1] && board[2][2] == board[1][1]) ||
                  (board[0][2] == board[1][1] && board[2][0] == board[1][1]) )
        );
    }

    public static boolean winByColumn(char[][] board) {
        for (int columnIndex = 0; columnIndex < 3; columnIndex++) {
            if (board[0][columnIndex] != ' '
                    && board[0][columnIndex] == board[1][columnIndex]
                    && board[0][columnIndex] == board[2][columnIndex]) {
                return true;
            }
        }
        return false;
    }

    public static boolean someoneWon(char[][] board) {
        boolean row = winByRow(board);
        boolean col = winByColumn(board);
        boolean diagonal = winByDiagonal(board);
        return  row || col || diagonal;
    }

    public static boolean gameOver(char[][] board) {
        return gameIsTied(board) || someoneWon(board);
    }

    public static boolean tryPlace(int rowIndex, int columnIndex, char[][] board, char currentPlayer) {
        if (rowIndex >= 0 && rowIndex <= 2 && columnIndex >= 0 && columnIndex <= 2 &&
                board[rowIndex][columnIndex] == ' ') {
            board[rowIndex][columnIndex] = currentPlayer;
            return true;
        }
        return false;
    }

    public static void printBoard(char[][] board) {

        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-----");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-----");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);

    }

    public static void arrayLists() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an item for your shopping list or DONE");
        String item = keyboard.nextLine();

        //String[] items = new String[10];
        ArrayList<String> items = new ArrayList<>();

        while (!item.equalsIgnoreCase("done")) {
            items.add(item); // will add the item to the END of the array
            System.out.println("Enter an item for your shopping list or DONE");
            item = keyboard.nextLine();
        }
        //              use .size() instead of .length
        for (int index = 0; index < items.size(); index++) {
            // use .get(index) instead of [index]
            System.out.println(items.get(index));
        }

        // read only loop works with ArrayLists
        for (String i : items) {
            System.out.println(i);
        }

        System.out.println("Do you want to remove any items? y/n");
        String choice = keyboard.nextLine();
        if (choice.equalsIgnoreCase("y")) {
            System.out.println("What time do you want to remove?");
            item = keyboard.nextLine();

            // removes the first occurrence it finds
            if (!items.remove(item)) {
                System.out.println("That item wasn't in the list");
            }
        }

        for (String i : items) {
            System.out.println(i);
        }


    }

    public static void arrays() {
        int score1 = 99;
        int score2 = 100;
        int score3 = score1;
        int score4 = 92;
        int score5 = 94;

        System.out.println("score1: " + score1);
        System.out.println("score3: " + score3);

        score1 = 100;
        System.out.println("score1: " + score1);
        System.out.println("score3: " + score3);

        // array - type name + square braces =  new keyword, type[number of values]
        int scores[] = new int[5]; // indexes 0-4

        // variables [index of] - you can set or get the value
        scores[0] = 99;
        scores[1] = 100;
        scores[2] = scores[0]; // assigns on the left, get on the right
        scores[3] = 92;
        scores[4] = 94;

        for (int index = 0; index < scores.length; index++) {
            System.out.println("Scores at index: " + index + " == " + scores[index]);
        }

        int highestScore = scores[0];
        int lowestScore = scores[0];
        double totalScore = 0; // to avoid int division

        // enhanced for loop - READ ONLY
        // for ( type variable-name in array )
        for (int score : scores) {
            if (score > highestScore) {
                highestScore = score;
            }
            if (score < lowestScore) {
                lowestScore = score;
            }
            totalScore += score;
        }

        System.out.println("Highest score: " + highestScore);
        System.out.println("Lowest score: " + lowestScore);
        System.out.println("Average score: " + totalScore / scores.length);
    }
}
