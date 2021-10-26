//Name: Lance Cross Date: 10/26/21 ID: 002634761
//creates objects to represent a fraction
 
public class Fraction {

    //instance variables to represent the numerator and denominator
    private int numerator;
    private int denominator;

    //constructors for Fraction
    public Fraction() {
        numerator = 1;
        denominator = 1;
    }
    public Fraction(int num, int denom) {
        numerator = num;
        denominator = denom;
    }
    //returns numerator
    public int getNumerator() {
        return numerator;
    }
    //returns denominator
    public int getDenominator() {
        return denominator;
    }
    //sets numerator
    public void setNumerator(int num) {
        numerator = num;
    }
    //sets denominator
    public void setDenominator(int denom) {
        denominator = denom;
    }
    //returns string representation of fraction
    public String toString() {
        return numerator + "/" + denominator;
    }
}