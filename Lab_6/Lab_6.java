//Name: Lance Cross Date: 09/28/21 ID: 002634761
//this program takes an array of integers from the user and prints the smallest gap between elements
import java.util.Scanner;

public class Lab_6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("How many elements is your array: ");
        //stores array given by user
        int[] nums = new int[console.nextInt()];
        //fills array with elements given by user
        for(int i = 0; i < nums.length; i++) {
            System.out.print("What is element " + (i+1) + ": ");
            nums[i] = console.nextInt();
        }
        console.close();
        int gap = minGap(nums);
        System.out.println("The smallest gap in the array is " + gap + ".");
    }
    //finds the minimum gap in the array
    public static int minGap(int[] nums) {
        if(nums.length < 2) {
            return 0;
        } else {
            //gives gap an initial value from the array so the loop below can compare
            int gap = Math.abs(nums[0] - nums[1]);
            //checks each gap to see if it is bigger
            for(int i = 1; i < nums.length - 1; i++) {
                if(Math.abs(nums[i] - nums[i + 1]) < gap) {
                    gap = Math.abs(nums[i] - nums[i + 1]);
                }
            }
            return gap;
        }
    }
}
