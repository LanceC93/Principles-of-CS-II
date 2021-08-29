import java.util.Scanner;

//Lance Cross 8/30/21 ChrisTree
//This program creates a christmas tree using heights and number of segments from the user.
public class ChrisTree {
    public static void main(String[] args) {
        int[] input = getUserInput();
        makeChrisTree(input);
    }

    public static int[] getUserInput(){
        int[] input = new int[2];
        Scanner scan = new Scanner(System.in);
        System.out.print("How tall do you want each segment: ");
        input[0] = scan.nextInt();
        System.out.print("How many segments do you want: ");
        input[1] = scan.nextInt();
        return input;
    }
    
    public static void makeChrisTree(int[] input) {
        int height = input[0];
        int segments = input[1];
        int maxWidth = 1 + 2 * (height - 1) + 2 * (segments - 1);
        for(int triangle = 0; triangle < segments; triangle++) {
            for(int row = 0; row < height; row++) {
                for(int space = maxWidth / 2 - triangle; space > row; space--) {
                    System.out.print(" ");
                }
                for(int stars = 1; stars <= row * 2 + triangle * 2 + 1; stars++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        makeBase(maxWidth);
    }
    public static void makeBase(int width) {
        for(int row = 0; row < 2; row ++) {
            for(int spaces = 0; spaces < width / 2; spaces++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.print("  ");
        for(int stars = 1; stars <= width - 4; stars++) {
            System.out.print("*");
        }
        System.out.println();
    }
}