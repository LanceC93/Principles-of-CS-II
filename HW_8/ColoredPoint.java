//Name: Lance Cross Date: 10/27/2021 ID: 002634761
//represents a point with a color
//extends Point class and implements Colored interface
public class ColoredPoint extends Point implements Colored {
    
    //contains color of the point
    private String color;

    //constructors for ColoredPoint
    public ColoredPoint() {
        setLocation(0,0);
        //defaults color to white
        color = "white";
    }
    public ColoredPoint(int x, int y, String c) {
        setLocation(x,y);
        color = c.toLowerCase();
    }
    //returns the color
    public String getColor() {
        return color;
    }

    //sets the color
    public void setColor(String c) {
        color = c.toLowerCase();
    }

    //overrides equals method from Point to account for color
    public boolean equals(Object o) {
        if (o instanceof ColoredPoint) {
            ColoredPoint other = (ColoredPoint) o;
            return super.equals(other) && color.equals(other.getColor());
        } else {  
            return false;
        }
    }
    //overrides toString method from Point
    public String toString() {
        return super.toString() + ", Color: " + color;
    }
}
