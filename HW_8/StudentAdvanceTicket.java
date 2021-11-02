//Name: Lance Cross Date: 10/27/2021 ID: 002634761
//class to represents advance tickets
public class StudentAdvanceTicket extends AdvanceTicket {
    
    //constructs student advance ticket with num and days
    public StudentAdvanceTicket(int num, int days) {
        super(num, days);
    }

    //returns price of student advance ticket
    public double getPrice() {
        if(getDays() >= 10) {
            return 15.0;
        } else {
            return 20.0;
        }
    }

    //returns string representation of student advance ticket
    public String toString() {
        return super.toString() + " (ID required)";
    }
}
