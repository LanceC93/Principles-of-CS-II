import java.awt.*;

//Name: Lance Cross Date: 10/17/2021 ID: 002634761
//tests YourFirstNameLine class

public class YourFirstNameLineTest {
    public static void main(String[] args) {
        YourFirstNameLine l1 = new YourFirstNameLine(new Point(4,7),new Point(6,1));
        DrawingPanel canvas = new DrawingPanel(10, 10);
        Graphics g = canvas.getGraphics();
        l1.draw(g);
        System.out.println("Your line is " + l1 + ".");
        System.out.println("Slope of the line is " + l1.getSlope() + ".");
    }
}
