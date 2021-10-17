import java.awt.*;

//Name: Lance Cross Date: 10/17/2021 ID: 002634761
//creates line objects
public class YourFirstNameLine {
    
    //point that represents the start of the line
    public Point startPoint;
    //point that represents the start of the line
    public Point endPoint;

    //creates object with the points given
    public YourFirstNameLine(Point p1, Point p2) {
        startPoint = p1;
        endPoint = p2;
    }
    //returns the start point of line
    public Point getStartPoint() {
        return startPoint;
    }
    //returns the start point of line
    public Point getEndPoint() {
        return endPoint;
    }
    //returns the slope of the line
    public double getSlope() {
        return (endPoint.getY() - startPoint.getY()) / (endPoint.getX() - startPoint.getX());
    }
    //returns String represenation of the line
    public String toString() {
        return "[(" + (int)startPoint.getX() + "," + (int)startPoint.getY() + "),(" + (int)endPoint.getX() + "," + (int)endPoint.getY() + ")]";
    }
    //draws the line
    public void draw(Graphics g) {
        g.drawLine((int)startPoint.getX(),(int)startPoint.getY(),(int)endPoint.getX(),(int)endPoint.getY());
    }
}
