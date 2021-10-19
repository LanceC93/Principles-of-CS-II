//Name: Lance Cross Date: 10/19/21 ID: 002634761
//creates Park objects

public class Park {
    
    //instance variables
    public String parkName;
    public int parkID;
    public String parkShape;
    private double parkLength;

    //constructor
    public Park(String name, int ID, String shape, double length) {
        parkName = name;
        parkID = ID;
        parkShape = shape;
        parkLength = length;
    }

    //returns the name of the Park
    public String parkNameGetter(){
        return parkName;
    }
    //returns park ID
    public int parkIDGetter() {
        return parkID;
    }
    //returns park length
    public double parkLengthGetter() {
        return parkLength;
    }
    //gets the area of the park
    public double getArea() {
        if(parkName.equals("Circle")) {
            return 3.14 * Math.pow(parkLength / 2, 2);
        } else {
            return parkLength * parkLength;
        }
    }
    //prints out string representation of park
    public String toString() {
        return parkName + "(ID: " + parkID + ", Shape: " + parkShape + ", Length: " + parkLength + ")";
    }
}
