//Name: Lance Cross Date: 10/4/2021 ID: 002634761
//asks for fraction from user and scales it up or down depending on what user wants
import java.util.Scanner;

public class FractionScale {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //gets variables from users
        System.out.print("Enter a Fraction: ");
        String fraction = console.nextLine();
        fraction = fraction.replaceAll(" ", "");
        int num = Integer.parseInt(fraction.substring(0, fraction.indexOf("/")));
        int denom = Integer.parseInt(fraction.substring(fraction.indexOf("/") + 1, fraction.length()));
        System.out.print("Scale up or down (1 for up, 0 for down): ");
        int flag = console.nextInt();
        System.out.print("Enter a scale factor: ");
        int factor = console.nextInt();
        console.close();

        //creates fraction from given variables and scales it
        Fraction frac = new Fraction(num, denom);
        if(flag == 0) {
            frac.scale(factor, false);
        } else {
            frac.scale(factor, true);
        }

        //prints scaled fraction
        System.out.println("The scaled fraction is " + frac.getNumerator() + "/" + frac.getDenominator() + ". ");
    }
}