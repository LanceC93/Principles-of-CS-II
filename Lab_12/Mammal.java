//Name: Lance Cross Date: 11/9/21 ID: 002634761
//includes Mammal class given in the lab instructions

public class Mammal {

    private int age;
    private double weight;

    Mammal(double weight, int age) {
        this.age = age;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
    public int getAge() {
        return age;
    }
}