//Name: Lance Cross Date: 11/9/21 ID: 002634761
//creates Human objects that are an extension of the Mammal class

public class Human extends Mammal {
    
    //instance variable
    private double height;

    //constructor
    public Human(double weight, int age, double height) {
        super(weight, age);
        this.height = height;
    }

    //returns height
    public double getHeight() {
        return height;
    }
    
    //returns string representation of a Human
    public String toString() {
        return "Human(Weight = " + getWeight() + ", Age = " + getAge() + ", Height = " + height + ")";
    }
}
