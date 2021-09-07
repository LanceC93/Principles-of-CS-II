//Name: Lance Cross Date: 09/7/21 ID: 002634761
//creates a class Rectangle to represent a rectangle
public class Rectangle {

    //variables of rectangle including the corner's x and y, width and height
    int x;
    int y;
    int width;
    int height;

    //constructs a rectangle object with default variable values
    public Rectangle(){
        x = 0;
        y = 0;
        width = 0;
        height = 0;
    }
    //constructs a Rectangle object with variable given
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    //sets all variables to given values
    public void setFields(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    //gets x coordinate
    public int getX() {
        return x;
    }
    //gets y
    public int getY() {
        return y;
    }
    //gets height
    public int getHeight() {
        return height;
    }
    //gets width
    public int getWidth() {
        return width;
    }
    //returns a string representation of the rectangle object
    public String toString() {
        return "Rectangle: (" + x + ", " + y + "), Height = " + height +", Width = " + width;
    }
}
