//Name: Lance Cross Date: 10/20/2021 ID: 002634761
//creates an array of paypal accounts
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        //gets the number of accounts from the user
        Scanner console = new Scanner(System.in);
        System.out.print("How many accounts? ");
        int numAccounts = console.nextInt();
        console.close();
        //creates the array of accounts
        PayPalAccount[] accounts = new PayPalAccount[numAccounts];
        fillArray(accounts);
        //holds first three digits of my ID
        int firstDigitsID = 2;
        //holds index of element with the right ID
        int IDIndex = checkID(accounts, 2);
        //changes balance to my last five digits / 100.
        accounts[IDIndex].setBalance(34761 / 100.);
        System.out.println("My Panther ID is 002-63-4761. My account information is " +accounts[IDIndex] + ".");
        printAverageBalance(accounts);
        printLargestBalance(accounts);
        printLowestBalance(accounts);
    }
    //fills array of accounts
    public static void fillArray(PayPalAccount[] accounts) {
        //holds random number between 0 and 1000 for balance
       double randNum = Math.random() * 1000;
        for(int i = 0; i < accounts.length; i++) {
            accounts[i] = new PayPalAccount(randNum);
            randNum = Math.random() * 1000;
        }
    }
    //checks all accounts in an array for an ID, changes it to have ID if it doesnt, and returns index if it has it
    public static int checkID(PayPalAccount[] accounts, int ID) {
        boolean hasID = false;
        for(int i = 0; i < accounts.length; i++) {
            if(accounts[i].getAccountID() == ID) {
                return i;
            }
        }
        accounts[accounts.length - 1].setAccountID(ID);
        accounts[accounts.length - 1].addBalance(accounts[0].getBalance());
        accounts[0].setBalance(0);
        return accounts.length - 1;
    }
    //prints the average balance
    public static void printAverageBalance(PayPalAccount[] accounts) {
        double totalBalance = 0;
        //adds all balances
        for(int i = 0; i < accounts.length; i++) {
            totalBalance += accounts[i].getBalance();
        }
        System.out.printf("The average balance is %.2f.\n", totalBalance / accounts.length);
    }
    //prints account with the largest balance
    public static void printLargestBalance(PayPalAccount[] accounts) {
        PayPalAccount maxAccount = accounts[0];
        //finds max balance
        for(int i = 1; i < accounts.length; i++) {
            if(accounts[i].getBalance() > maxAccount.getBalance()) {
                maxAccount = accounts[i];
            }
        }
        System.out.println("The account with the largest balance: " + maxAccount + "."); 
    }
    //prints lowest balance
    public static void printLowestBalance(PayPalAccount[] accounts) {
        PayPalAccount minAccount = accounts[0];
        //finds max balance
        for(int i = 1; i < accounts.length; i++) {
            if(accounts[i].getBalance() < minAccount.getBalance()) {
                minAccount = accounts[i];
            }
        }
        System.out.println("The account with the lowest balance: " + minAccount + ".");
    }
}