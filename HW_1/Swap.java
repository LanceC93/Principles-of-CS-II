import java.util.Scanner;
import java.lang.Math;

//Lance Cross 8/30/21 Swap
//This program swaps the digit pairs of my panther number.
//It also swaps digit pairs of an int received from the user.
//Then, it asks for a string and swaps letter pairs.
public class Swap {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int pantherId = 2634761;
        System.out.println("Swapped panther number is: " + swapDigitPairs(pantherId));
        
        System.out.print("Input a number for swapping: ");
        int numInput = userInput.nextInt();
        System.out.println(swapDigitPairs(numInput));
        
        System.out.print("Input a string for swapping: ");
        String stringInput = userInput.next();
        System.out.println(swapLetterPairs(stringInput));
    }
    public static int swapDigitPairs(int num) {
        int swappedNum = 0;
        int power = 0;
        for( ;num >= 10;){
            swappedNum += (num % 10) * Math.pow(10, power + 1);
            num /= 10;
            swappedNum += (num % 10) * Math.pow(10, power);
            num /= 10;
            power += 2;
        }
        if(num > 0) {
            return swappedNum + num * (int)Math.pow(10, power);
        } else {
            return swappedNum;
        }
    }
    public static String swapLetterPairs(String str) {
        int length = str.length();
        String swappedStr = "";
        if(length % 2 == 1) {
            swappedStr = swappedStr + str.charAt(0);
            for(int i = 1; i < length; i += 2) {
                swappedStr = swappedStr + str.charAt(i + 1);
                swappedStr = swappedStr + str.charAt(i);
            }
            return swappedStr;
        } else {
            for(int i = 0; i < length; i += 2) {
                swappedStr = swappedStr + str.charAt(i + 1);
                swappedStr = swappedStr + str.charAt(i);
            }
            return swappedStr;
        }
    }
}