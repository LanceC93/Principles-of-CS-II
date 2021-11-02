//Name: Lance Cross Date: 11/2/21 ID: 002634761
//creates objects to represent a cat

public class Cat extends Animal {
    
    //instance variable
    private String color;

    //constructor
    public Cat(boolean veg, String eats, int legs, String color) {
        super(veg, eats, legs);
        this.color = color;
    }

    //sets color
    public void setColor(String color) {
        this.color = color;
    }
    //returns color
    public String getColor() {
        return color;
    }
}