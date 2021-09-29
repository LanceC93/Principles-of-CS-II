//Name: Lance Cross Date: 9/28/21 ID: 002634761
//this is the client program for the ISBN class
import java.util.Scanner;

public class ISBNClient {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //asks the user for digits and checkSymbol
        System.out.print("What are the digits for the ISBN: ");
        String digits = console.next();
        System.out.print("What is the check symbol for the ISBN: ");
        String check = console.next();
        console.close();
        //creates new ISBN object
        ISBN isbn = new ISBN(digits, check);
        //prints string form of ISBN object
        System.out.println("Your ISBN number is: " + isbn.toString());
        //prints if the ISBN is valid or not
        if(isbn.isValid()) {
            System.out.println("This ISBN is valid.");
        } else {
            System.out.println("This ISBN is not valid.");
        }
    }
}