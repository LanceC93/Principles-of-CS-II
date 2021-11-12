//Name: Lance Cross Date: 11/2/21 ID: 002634761
//creates objects to represent an animal

public class Animal {
    
    //instance variables
    private boolean veg;
    private String eats;
    private int numLegs;

    //constructor
    public Animal(boolean veg, String eats, int legs) {
        this.veg = veg;
        this.eats = eats;
        numLegs = legs;
    }

    //sets eats
    public void setEats(String eats) {
        this.eats = eats;
    }
    //sets numLegs
    public void setNumLegs(int legs) {
        numLegs = legs;
    }
    //sets veg
    public void setVegetarian(boolean veg) {
        this.veg = veg;
    }
    //returns eats
    public String getEats() {
        return eats;
    }
    //returns numLegs
    public int getNumLegs() {
        return numLegs;
    }
    //returns vegetarian
    public boolean isVegetarian() {
        return veg;
    }
}