//Name: Lance Cross Date: 11/16/21 ID: 002634761
//contains a sequential search method, an iterative binary search, and a recursive binary search
import java.util.*;

public class Lab_13 {
    public static void main(String[] args) {
        //creates an unsorted array to pass to the sequential search method
        int[] unsorted = {3,7,2,1,9,5,8};
        //creates sorted array for the binary search methods
        int[] sorted = {1,2,5,15,18,23};
        //stores the number that will be searched for
        int num = 2;
        //stores the outputs from the search methods
        int output = seqSearch(unsorted, num);

        //prints the index of num if it is found in the array and prints it isnt there otherwise
        if(output > 0) {
            System.out.println("The index of " + num + " in unsorted is " + output + ". ");
        } else {
            System.out.println(num + " was not found in the unsorted array.");
        }
        output = binSearch(sorted, num);

        //prints the index of num if it is found in the array and prints it isnt there otherwise
        if(output > 0) {
            System.out.println("The index of " + num + " in sorted is " + output + ". ");
        } else {
            System.out.println(num + " was not found in the sorted array.");
        }
        output = recBinSearch(sorted, 0, sorted.length, num);

        //prints the index of num if it is found in the array and prints it isnt there otherwise
        if(output > 0) {
            System.out.println("The index of " + num + " in sorted is " + output + ". ");
        } else {
            System.out.println(num + " was not found in the sorted array.");
        }         
    }
    //searchs an unsorted array for an int sequentially
    public static int seqSearch(int[] arr, int num) {
        int index = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                index = i;
            }
        }
        return index;
    }
    //uses binary search iteratively
    public static int binSearch(int[] arr, int num) {
        //holds temporary array
        int[] temp = arr;
        //represent mid index of the array
        int mid = temp.length / 2;
        //keeps seacrhing the array by halves until it finds element
        while(arr.length > 1) {
            //makes the array equal to the first
            if(num > temp[mid]) {
                temp = Arrays.copyOfRange(temp, mid + 1, temp.length);
                mid = temp.length / 2;
            } else if(num < temp[mid]) { //makes the array equal to the second half
                temp = Arrays.copyOfRange(temp, 0, mid);
                mid = temp.length / 2;
            } else {
                return mid;
            }
        }
        //returns if element is not found
        return -1;
    }
    //uses binary search recursively
    public static int recBinSearch(int[] arr, int first, int length, int num) {
        //keeps calling binary search until the array is one element long
        if(length >= 1) {
            //represents middle index of the array
            int mid = first + (length - 1) / 2;

            //calls binary search again with the second half if num is bigger
            if(num > arr[mid]) {
                return recBinSearch(arr, mid + 1, length, num);
            } else if(num < arr[mid]) {   //calls binary seacrh with first half if num is smaller
                return recBinSearch(arr, first, mid-1, num);
            } else {  //returns mid as the index once it is found
                return mid;
            }
        }
        //returns -1 if elements is never found
        return -1;
    }
}