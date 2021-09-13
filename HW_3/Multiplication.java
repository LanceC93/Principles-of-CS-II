//Name: Lance Cross Date: 9/13/21 ID: 002634761
//This program contains a method named multiply that multiplys with just + and -
//The main contains 3 examples of its execution
public class Multiplication {
    public static void main(String[] args) {
        System.out.println("5 x 2 = " + multiply(5,2));
        System.out.println("10 x 30 = " + multiply(10,30));
        System.out.println("3 x 12 = " + multiply(3,12));
    }
    //multiplys int a and b using recursive addition
    public static int multiply(int a, int b) {
        if(b != 1) {
            a += multiply(a,b-1);
        }
        return a;

    }
}