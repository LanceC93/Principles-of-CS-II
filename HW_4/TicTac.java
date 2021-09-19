//Name: Lance Cross Date: 9/20/21 ID: 002634761
//This program creates a game of tic-tac-toe for the user to play
import java.util.Scanner;

public class TicTac {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char[] row1 = {'-', '-','-'};
        char[] row2 = {'-', '-','-'};
        char[] row3 = {'-', '-','-'};
        welcome(row1, row2, row3);
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
}
