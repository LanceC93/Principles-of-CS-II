//Name: Lance Cross Date: 09/14/21 ID: 002634761
//takes integers from user until it is given a negative and outputs average
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter an integer (use \"enter\" to seperate them): ");
        //stores inputed variable so it can be checked for sentinel value
        int input = console.nextInt();
        //sum of all ints passed
        int sum = 0;
        //counts the number of ints passed for division later
        double numberInts = 0;
        //keeps asking for ints and adding them to sum until a egative number is given
        while(input >= 0) {
            numberInts += 1.0;
            sum += input;
            input=console.nextInt();
        }
        //prints final average
        System.out.println("Your average is: " + sum/numberInts);
        console.close();
    }
}