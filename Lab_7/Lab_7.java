//Name: Lance Cross Date: 10/5/21 ID: 002634761
//contains MinLengthGetter, MaxLengthGetter, FrequencyCalculator, and StringValueGetter
//functions for Strins[], creates a test array and calls methods
import java.util.*;

public class Lab_7 {
    public static void main(String[] args) {
        int m = 1 + 4;

        //initializes testArray
        String[] testArray = new String[m];
        testArray[0] = "a";
        testArray[1] = "abcdefghijklmnopqrstuvwxyz";
        testArray[2] = "kjds";
        testArray[3] = "febdsh";
        testArray[4] = "dhdbs";
        int randPosition = (int)(Math.random() * 4);
        
        //calls the four methods
        System.out.println("The position of the smallest string is " + MinLengthGetter(testArray) + ". ");
        System.out.println("The position of the largest string is " + MaxLengthGetter(testArray) + ". ");
        System.out.println("The frequencies of each letter at position " + randPosition + " are " + Arrays.toString(FrequencyCalculator(randPosition, testArray)) + ".");
        System.out.println("The value of the string at position " + randPosition + " is " + StringValueGetter(randPosition, testArray) + ".");    
    }
    //returns position of string with the longest length
    public static int MaxLengthGetter(String[] input) {
        int position = 0;
        for(int i = 1; i < input.length; i++) {
            if(input[i].length() > input[position].length()) {
                position = i;
            }
        }
        return position;
    }  
    //returns position of string with the shortest length
    public static int MinLengthGetter(String[] input) {
        int position = 0;
        for(int i = 1; i < input.length; i++) {
            if(input[i].length() < input[position].length()) {
                position = i;
            }
        }
        return position;
    }
    //gets the frequency of each lowercase letter at the given position
    public static int[] FrequencyCalculator(int position, String[] array) {
        int[] frequency = new int[26];
        for(int i = 0; i < array[position].length(); i++) {
            if(array[position].charAt(i) > 96 && array[position].charAt(i) < 123) {
                frequency[array[position].charAt(i) - 97]++;
            }
        }
        return frequency;
    }
    //gets the value of a string
    public static int StringValueGetter(int position, String[] input) {
        int nValue = 0;
        for(int i = 0; i < input[position].length(); i++) {
            nValue += input[position].toLowerCase().charAt(i) - 96;
        }
        return nValue;
    }  
}
