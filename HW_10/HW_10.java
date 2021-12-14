//Name: Lance Cross Date: 11/24/2021 ID: 002634761
//contains multiple sorting algorrithms
import java.util.Arrays;

public class HW_10 {
    public static void main(String[] args) {
        //creates array to be sorted
        int[] arr = new int[10];
        numFill(arr);

        //sorts with selections sort and prints
        System.out.println("Before Selection Sort: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After Selection Sort: " + Arrays.toString(arr));
        //fills array again
        numFill(arr);

        //sorts with bubble sort and prints
        System.out.println("Before Bubble Sort: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After Bubble Sort: " + Arrays.toString(arr));
        numFill(arr);

        //sorts with insertion sort and prints
        System.out.println("Before Insertion Sort: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After Insertion Sort: " + Arrays.toString(arr));

        //creates array of strings for sorting
        String[] arr2 = {"hello", "how", "are", "you"}; 
        //sorts with selection sort and prints
        System.out.println("Before Selection Sort: " + Arrays.toString(arr2));
        sSelectionSort(arr2);
        System.out.println("After Selection Sort: " + Arrays.toString(arr2));

        //sets array of strings for sorting
        String[] arr3 = {"i", "am", "fine", "you?"}; 
        //sorts with selection sort and prints
        System.out.println("Before Insertion Sort: " + Arrays.toString(arr3));
        sInsertionSort(arr3);
        System.out.println("After Insertion Sort: " + Arrays.toString(arr3));
        numFill(arr);

        //sorts with bubble sort and prints
        System.out.println("Before Dual Selection Sort: " + Arrays.toString(arr));
        dualSelectionSort(arr);
        System.out.println("After Dual Selection Sort: " + Arrays.toString(arr));
    }
    //fills array with random ints from 1-10
    public static void numFill(int[] arr) {
        //fills array
        for(int i = 1; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 9) + 1;
        }
    }
    //sort method that selects min value on each run through and sets the first value to it
    public static void selectionSort(int[] arr) {
        //initializes the first minimum to the first element
        int min = 0;
        int temp;
        //goes through each index of the array
        for(int i = 0; i < arr.length - 1; i++) {
            //sets the minimum index to the first element being checked
            min = i;
            //checks rest or array for the minimum
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            //switches first and minimum elements
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    //sorts using bubble sort
    public static void bubbleSort(int[] arr) {
        //stores temporary int value
        int temp = 0;
        //traverses array
        for(int i = 0; i < arr.length; i++) {
            //goes through each element 
            for(int j = 1; j < arr.length - i; j++) {
                //swaps elements if smaller
                if(arr[j - 1] < arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    //sorts with insertion sort
    public static void insertionSort(int[] arr) {
        //represents indexes behind the key
        int num = 0;
        //represents last index of sorted part
        int last = 0;
        //traverses array
        for(int i = 1; i < arr.length; i++) {
            last = arr[i];
            num = i - 1;
            //checks sorted part of array to insert element
            while(num >= 0 && (arr[num] > last)) {
                arr[num + 1] = arr[num];
                num--;
            }
            arr[num + 1] = last;
        }
    }
    //selection sort for strings
    public static void sSelectionSort(String[] arr) {
        //initializes the first minimum to the first element
        int min = 0;
        String temp = "";
        //goes through each index of the array
        for(int i = 0; i < arr.length - 1; i++) {
            //sets the minimum index to the first element being checked
            min = i;
            //checks rest or array for the minimum
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
            }
            //switches first and minimum elements
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    //insertion sort for strings
    public static void sInsertionSort(String[] arr) {
        //represents indexes behind the key
        int num = 0;
        //represents last index of sorted part
        String last = "";
        //traverses array
        for(int i = 1; i < arr.length; i++) {
            last = arr[i];
            num = i - 1;
            //checks sorted part of array to insert element
            while(num >= 0 && (arr[num].compareTo(last) > 0)) {
                arr[num + 1] = arr[num];
                num--;
            }
            arr[num + 1] = last;
        }
    }
    //selection sort for lowest and highest
    public static void dualSelectionSort(int[] arr) {
        //initializes the first minimum and maximum
        int min = 0;
        int max = 0;
        int temp;
        //goes through each index of the array
        for(int i = 0; i < arr.length / 2; i++) {
            //sets the minimum index to the first element being checked
            min = i;
            //sets the maximum index to the last
            max = arr.length - 1 - i;
            //checks rest or array for the minimum and maximum
            for(int j = i + 1; j < arr.length - i; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                } else if(arr[j] > arr[max]) {
                    max = j;
                }
            }
            //switches first and minimum elements
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            //switches last and maximum elements
            temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[max];
            arr[max] = temp;
        }
    }
}