//Name: Lance Cross Date: 09/7/21 ID: 002634761
//creates two rectangles, sets values, and prints them
public class RectangleClient {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();
        rect1.setFields(1,2,4,5);
        rect2.setFields(2,1,7,9);
        System.out.println(rect1.toString());
        System.out.println(rect2.toString());
    }
}
