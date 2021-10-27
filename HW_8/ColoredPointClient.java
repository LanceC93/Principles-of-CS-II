//Name: Lance Cross Date: 10/27/2021 ID: 002634761
//client code for Colored Point
public class ColoredPointClient {
    public static void main(String[] args) {
        //creates ColoredPoint objects
        ColoredPoint c1 = new ColoredPoint(0,1,"black");
        ColoredPoint c2 = new ColoredPoint(3,2,"teal");

        //prints out objects
        System.out.println("Colored Point 1: " + c1 + ".");
        System.out.println("Colored Point 2: " + c2 + ".");

        //compares the points
        if(c1.equals(c2)) {
            System.out.println("Colored Points 1 and 2 are equal.");
        } else {
            System.out.println("Colored Points 1 and 2 are not equal.");
        }
    }
}
