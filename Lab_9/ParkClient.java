//Name: Lance Cross Date: 10/19/21 ID: 002634761
//creates an array of Parks and print the info for the largest
public class ParkClient {
    public static void main(String[] args) {
        //creates and initializes first two values of parkArray
        Park[] parkArray = new Park[5];
        parkArray[0] = new Park("CSC 1302", 61, "Circle", 5);
        parkArray[1] = new Park("CSC 1302", 64, "Square", 6);
        //fills the rest of the parkArray
        for(int i = 2; i < 5; i++) {
            if(i % 2 == 0) {
                parkArray[i] = new Park("CSC 1302", 61 + (3*i), "Circle", (Math.random() * 9) + 1);
            } else {
                parkArray[i] = new Park("CSC 1302", 61 + (3*i), "Square", (Math.random() * 9) + 1);
            }
        }
        //checks for the largest park
        Park largestPark = parkArray[0];
        for(int i = 1; i < 5; i++) {
            if(parkArray[i].getArea() > largestPark.getArea()) {
                largestPark = parkArray[i];
            }
        }
        //prints result
        System.out.println("The largest park is " + largestPark + ".");
    }
}
