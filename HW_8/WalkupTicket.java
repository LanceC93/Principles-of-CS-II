//Name: Lance Cross Date: 10/27/2021 ID: 002634761
//class to represents walkup tickets, price is $50

public class WalkupTicket extends Ticket {
    
    //constructs WalkupTickets with a number
    public WalkupTicket(int num) {
        super(num);
    }

    //gets the price of a walkup ticket
    public double getPrice() {
        return 50.0;
    }
}