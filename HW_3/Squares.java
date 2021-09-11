//Name: Lance Cross Date: 9/13/21 ID: 002634761
//This program contains a method named writeSquares that prints even squares (below given integer n) in descending order
//Then, it prints odd squares (below given integer n) in ascending order
//The main contains 3 examples of its execution

public class Squares {
    public static void main(String[] args) {
        writeSquares(4);
    }
    //writes descending even squares and ascending odd squares below n
    public static void writeSquares(int n) {
        if(n == 1) {
            System.out.print((int) Math.pow(n, 2));
        } else if(n % 2 == 0) {
            System.out.print((int) Math.pow(n, 2) + ", ");
            writeSquares(n - 1);
        } else {
            writeSquares(n - 1);
            System.out.print(", " + (int)Math.pow(n, 2));
        }
    }
}
