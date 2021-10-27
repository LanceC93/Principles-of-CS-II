//Name: Lance Cross Date: 10/27/2021 ID: 002634761
//class to represents advance tickets
public class AdvanceTicket extends Ticket{

    //represents days in advance it is purchased
    private int days;
    
    //constructs advance ticket with num and number of days
    public AdvanceTicket(int num, int days) {
        super(num);
        this.days = days;
    }
    //returns price of advance ticket
    public double getPrice() {
        if(days >= 10) {
            return 30.0;
        } else {
            return 40.0;
        }
    }
    //returns days
    public int getDays() {
        return days;
    }
}