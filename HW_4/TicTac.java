//Name: Lance Cross Date: 9/20/21 ID: 002634761
//This program creates a game of tic-tac-toe for the user to play
import java.util.Scanner;

public class TicTac {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char[] row1 = {'-', '-','-'};
        char[] row2 = {'-', '-','-'};
        char[] row3 = {'-', '-','-'};
        int[] input = new int[2];
        welcome(row1, row2, row3);
        int turn = 0;
        do {
            turn ++;
            input = getInput(console);
            if(input[0] == 0 && turn % 2 == 1) {
                row1[input[1]] = 'x'; 
            } else if(input[0] == 0 && turn % 2 == 0) {
                row1[input[1]] = 'o';
            } else if(input[0] == 1 && turn % 2 == 1) {
                row2[input[1]] = 'x'; 
            } else if(input[0] == 1 && turn % 2 == 0) {
                row2[input[1]] = 'o';
            } if(input[0] == 2 && turn % 2 == 1) {
                row3[input[1]] = 'x'; 
            } else if(input[0] == 2 && turn % 2 == 0) {
                row3[input[1]] = 'o';
            }
            printboard(row1, row2, row3);
        } while(checkWinner(row1, row2, row3, turn));
    }
    //prints welcome message and the initial board
    public static void welcome(char[] row1, char[] row2, char[] row3) {
        System.out.println("Welcome to Tic-Tac-Toe. This is the board.");
        printboard(row1, row2, row3);
    }
    //prints the current state of the board
    public static void printboard(char[] row1, char[] row2, char[] row3) {
        System.out.println("-------------");
        System.out.println("| " + row1[0] + " | " + row1[1] + " | " + row1[2] + " |");
        System.out.println("-------------");
        System.out.println("| " + row2[0] + " | " + row2[1] + " | " + row2[2] + " |");
        System.out.println("-------------");
        System.out.println("| " + row3[0] + " | " + row3[1] + " | " + row3[2] + " |");
        System.out.println("-------------");
    }
    //this method gets input from the user
    public static int[] getInput(Scanner console) {
        int[] temp = new int[2];
        System.out.print("Enter the row index:" );
        temp[0] = console.nextInt();
        System.out.print("Enter the column index:" );
        temp[1] = console.nextInt();
        return temp;
    }
    //checks the arrays to see if there is a winner
    public static boolean checkWinner(char[] row1, char[] row2, char[] row3, int turn) {
        return turn != 6;
    }
}
