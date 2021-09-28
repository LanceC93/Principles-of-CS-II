//Name: Lance Cross Date: 09/21/21 ID: 002634761
//this program takes an integer from the user and prints how many digits it has
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        //holds the input from user
        int num = console.nextInt();
        console.close();
        //stores the number of digits
        int digits = countDigit(num);
        System.out.println("The number " + num + " has " + digits + " digits.");
    }
    //count the amount of digits and returns it as a integer
    public static int countDigit(int num) {
        //stores digits
        int numDigits = 0;
        //counts the number of digits in num
        while(num > 0) {
            numDigits++;
            num /= 10;
        }
        return numDigits;
    }
}
