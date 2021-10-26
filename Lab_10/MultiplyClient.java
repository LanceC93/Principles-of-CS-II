//Name: Lance Cross Date: 10/19/21 ID: 002634761
//multiplies an array of fractions together
import java.util.*;

public class MultiplyClient {
    public static void main(String[] args) {
        //creates array of fractions
        Fraction[] fractionArray = new Fraction[4];
        //sets numerator and denominators of each fraction randomly
        int randNum = ((int)(Math.random() * 9) + 1);
        int randDenom = ((int)(Math.random() * 9) + 1);
        for(int i = 0; i < fractionArray.length; i++) {
            fractionArray[i] = new Fraction(randNum, randDenom);
            randNum = ((int)(Math.random() * 9) + 1);
            randDenom = ((int)(Math.random() * 9) + 1);
        }
        //stores products from previous array
        Fraction[] multiplied = new Fraction[3];
        //multiplies each adjacent fraction in fracitonArray
        for(int i = 0; i < fractionArray.length - 1; i++) {
            multiplied[i] = fractionMultiply(fractionArray[i], fractionArray[i + 1]);
        }
        //prints original fraction array and the array of products
        System.out.println("Original Fractions: " + Arrays.toString(fractionArray) + ".");
        System.out.println("Products of each adjacent Fraction: " + Arrays.toString(multiplied) + ".");
    }
    //multiplies fractions and returns product
    public static Fraction fractionMultiply(Fraction f1, Fraction f2) {
        //represents multiplied numerator
        int mNum = f1.getNumerator() * f2.getNumerator();
        //represents multiplied denominator
        int mDenom = f1.getDenominator() * f2.getDenominator();
        return new Fraction(mNum, mDenom);
    }
}
