//Name: Lance Cross Date: 10/27/2021 ID: 002634761
//class to represents tickets

abstract class Ticket {

    //intance variables 
    private int number;

    //constructs ticket with a number
    public Ticket(int num) {
        number = num;
    }

    //gets price of tickets
    public abstract double getPrice();

    //returns string representation of tickets
    public String toString() {
        return "Number: " + number +", Price: " + getPrice();
    }
}