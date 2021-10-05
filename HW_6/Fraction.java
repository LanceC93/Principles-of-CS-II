//Name: Lance Cross Date: 10/4/2021 ID: 002634761
//class for the construction of fraction objects

public class Fraction {
    
    private int numerator;   
    private int denominator;
  
    // Constructors
    public Fraction(int num, int denom) {
      numerator = num;
      denominator = denom;
    }

    public Fraction() {
      numerator = 0;
      denominator = 1;
    }

    public Fraction(int num) {
      numerator = num;
      denominator = 1;
    }
  
    public int getNumerator() {
      return numerator;
    }
  
    public int getDenominator() {
      return denominator;
    }
  
    public Fraction add(Fraction f) {
      int num = numerator * f.denominator + f.numerator * denominator;
      int denom = denominator * f.denominator;
      return new Fraction(num, denom);
    }
    //scales up the fraction by the factor given
    public void scaleup(int factor) {
        numerator *= factor;
    }
    //scales down the fraction by the factor given unless it is 0
    public void scaledown(int factor) {
      if(factor == 0) {
        System.out.println("Cannot scale by a factor of 0.");
      } else {
        denominator *= factor;
      }
    }
    //scales up if flag is true and scales down if flag is false and factor isn't 0
    public void scale(int factor, boolean flag) {
      if(flag) {
        scaleup(factor);
      } else {
        scaledown(factor);
      } 
    }
  }
  