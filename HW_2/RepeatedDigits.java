//Name: Lance Cross Date: 9/6/21
//This program gets a number from the user and counts how many times each digit repeats
import java.util.Scanner;

public class RepeatedDigits {
    public static void main(String[] args) {
        //gets int from user
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long input = console.nextLong();

        int[] occurences = countDigits(input);
        printOccurences(occurences);
    }
    //prints the digits line and counts occurences
    public static int[] countDigits(long num) {
        System.out.println("\nDigits:         0    1    2    3    4    5    6    7    8    9");
        int[] occurences = {0,0,0,0,0,0,0,0,0,0};
        int lastDigit = 0;
        for(long i = num; i > 0; i /= 10) {
            lastDigit = (int)(i % 10);
            occurences[lastDigit] += 1;
        }
        return occurences;
    }
    //prints digit occurences from array
    public static void printOccurences(int[] occurences) {
        String result = "Occurences: ";
        for(int i = 0; i < occurences.length; i++) {
            if(occurences[i] > 999) {
                result = result + " ";
            } else if(occurences[i] > 99) {
                result = result + "  ";
            } else if(occurences[i] > 9) {
                result = result + "   ";
            } else {
                result = result + "    ";
            }
            result = result + occurences[i];
        }
        System.out.println(result);
    }
}
