//Name: Lance Cross Date: 9/6/21 ID: 002634761
//This program generates a random number of people from 1-15.
//Then, it asks the user for the income of each person and displays there taxes
//Finally, it displays the people with the highest values of taxes
import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //creates random int in the range 1-15
        int randInt = (int)((Math.random() * 14) + 1);
        String maxPeople = displayTax(randInt, console);
        console.close();
        printMaxes(maxPeople);
    }
    //asks for income, displays amount of tax, and determines people with the maximum tax
    public static String displayTax(int numPeople, Scanner console) {
        double tax = 0;
        //tracks which numbered people have the max amount of tax
        String maxPeople = "";
        double maxTax = 0;

        //calculates taxes for incomes given by the user
        for(int i = 1; i <= numPeople; i++) {
            System.out.print("What is the income for person " + i + ": ");
            tax = console.nextDouble();
            //determines tax margin
            if(tax < 750) {
                tax *= .01;
            } else if(750 < tax && tax < 2500) {
                tax = 7.5 + ((.02 * tax) / 750);
            } else if(2500 < tax && tax < 5000) {
                tax = 82.5 + ((.04 * tax) / 2500);
            } else if(5000 < tax && tax < 8000) {
                tax = 142.5 + ((.05 * tax) / 5000);
            } else {
                tax = 230 + ((.06 * tax) / 8000);
            }
            if(tax > maxTax) {
                maxTax = tax;
                maxPeople = "" + i;
            } else if(tax == maxTax) {
                maxPeople = maxPeople + i;
            }
            System.out.printf("The amount of tax for person %d is %.2f.\n", i, tax);
        }
        return maxPeople;
    }
    //prints out people with the max amount of taxes
    public static void printMaxes(String str) {
        String result = "People ";
        if(str.length() >= 3) {
            for(int i = 0; i < str.length() - 1; i++) {
                result = result + str.charAt(i) + ", ";
            }
            result = result + "and " + str.charAt(str.length() - 1) + " have ";
        } else if(str.length() == 2) {
            result = result + str.charAt(0) + " and " + str.charAt(1) + " have ";
        } else {
            result = "Person " + str + " has ";
        }
        System.out.println(result + "the max tax value.");
    }
}