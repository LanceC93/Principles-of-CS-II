//Name: Lance Cross Date: 09/21/21 ID: 002634761
//this program take a name from the user and prints it and its length if it is a name that starts with a letter
import java.util.Scanner;

public class LegitName {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name: ");
        //stores name given by user
        String name = console.nextLine();
        console.close();
        //checks if the first character is a letter
        if((name.charAt(0) > 64 && name.charAt(0) < 91) || (name.charAt(0) > 96 && name.charAt(0) < 123)) {
            System.out.println("My name is " + name + ".");
            System.out.println("The string length of \"" + name + "\" is " + name.length() + ".");
        } else {
            System.out.println("Invalid Name: Does not start with a letter.");
        }
    }
}
