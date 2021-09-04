//Name: Lance Cross Date: 9/6/21
//This program gets an int from the user and counts how many times each digit repeats
import java.util.Scanner;

public class RepeatedDigits {
    public static void main(String[] args) {
        //gets int from user
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = console.nextInt();

        printResults(input);
    }
    //prints digits and their occurences
    public static void printResults(int num) {
        System.out.println("\nDigits:    0   1   2   3   4   5   6   7   8   9");
        int[] occurences = {0,0,0,0,0,0,0,0,0,0};
        int lastDigit = 0;
        for(int i = num; i > 0; i /= 10) {
            lastDigit = i % 10;
            occurences[lastDigit] += 1;
        }
    }
}
