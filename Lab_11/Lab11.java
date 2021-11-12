//Name: Lance Cross Date: 11/2/21 ID: 002634761
//client code for Cat class

public class Lab11 {
    public static void main(String[] args) {
        //creates cat object
        Cat c = new Cat(false, "meats", 4, "white");
        //prints if the cat is vegetarian or not
        if(c.isVegetarian()) {
            System.out.println("Cat is vegetarian."); 
        } else {
            System.out.println("Cat is not vegetarian");
        }
        //prints what the cat eats, the number of legs, and color
        System.out.println("Cat eats " + c.getEats() + ". ");
        System.out.println("Cat has " + c.getNumLegs() + " legs. ");
        System.out.println("Cat's color is " + c.getColor() + ". ");
    }
}
