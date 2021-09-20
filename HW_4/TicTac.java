//Name: Lance Cross Date: 9/20/21 ID: 002634761
//This program creates a game of tic-tac-toe for the user to play
import java.util.Scanner;

public class TicTac {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //stores values on the tictactoe board
        char[][] board = {{'-', '-','-'}, {'-', '-','-'}, {'-', '-','-'}};
        int[] input = new int[2];
        welcome(board);
        int turn = 0;
        //keeps playing until the game is over
        do {
            turn ++;
            input = getInput(console);
            if(turn % 2 == 1) {
                board[input[0]][input[1]] = 'x';
            } else {
                board[input[0]][input[1]] = 'o';
            }
            printboard(board);
        } while(checkWinner(board, turn));
        //prints if there was a winner or not
        if(turn == 9) {
            System.out.println("It was a draw.");
        } else {
            System.out.println("We have a winner.");
        }
        console.close();
    }
    //prints welcome message and the initial board
    public static void welcome(char[][] board) {
        System.out.println("Welcome to Tic-Tac-Toe. This is the board.");
        printboard(board);
    }
    //prints the current state of the board
    public static void printboard(char[][] board) {
        System.out.println("-------------");
        for(int i = 0; i <= 2; i++) {
            System.out.println("| " + board[i][0] + " | " + board[i][1] + " | " + board[i][2] + " |");
            System.out.println("-------------");
        }
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
    public static boolean checkWinner(char[][] board, int turn) {
        //checks for the up and down line wins
        for(int i = 0; i <= 2; i ++) {
            if(board[i][0] == board[i][1] && board[i][0] == board[i][2] && (board[i][0] == 'x' || board[i][0] == 'o')) {
                return false;
            } else if(board[0][i] == board[1][i] && board[0][i] == board[2][i] && (board[0][i] == 'x' || board[0][i] == 'o')) {
                return false;
            }
        }
        //checks for diagonals and draws
        if(board[0][0] == board[1][1] && board[0][0] == board[2][2] && (board[0][0] == 'x' || board[0][0] == 'o')) {
            return false;
        } else if(board[0][2] == board[1][1] && board[0][2] == board[2][0] && (board[0][2] == 'x' || board[0][2] == 'o')) {
            return false;
        } else if(turn == 9) {
            return false;
        }
        return true;
    }
}