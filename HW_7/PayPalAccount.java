//Name: Lance Cross Date: 10/20/2021 ID: 002634761
//create PayPalAccount objects

public class PayPalAccount {

    //makes sure all IDs are unique
    private static int IDCounter = 1;
    //instance variables of paypal account
    private double balance;
    private int accountID;

    //consructs PayPalAccount objects with no balance specified
    public PayPalAccount() {
        balance = 0;
        accountID = IDCounter;
        IDCounter++;
    }
    //constructs PayPalAccount object with specified balance
    public PayPalAccount(double balance) {
        this.balance = balance;
        accountID = IDCounter;
        IDCounter++;
    }
    //adds to the balance
    public void addBalance(double num) {
        balance += num;
    }
    //sets balance
    public void setBalance(double num) {
        balance = num;
    }
    //sets ID
    public void setAccountID(int ID) {
        accountID = ID;
    }
    //gets balance
    public double getBalance() {
        return balance;
    }
    //gets ID
    public int getAccountID() {
        return accountID;
    }
    //returns string representation
    public String toString() {
        return "Account ID = " + accountID + ", Balance = " + Math.round(balance * 100.0) / 100.0;
    }
}