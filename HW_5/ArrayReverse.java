//Name: Lance Cross Date: 9/28/21 ID: 002634761
//reverses every 4 elements in an ArrayList
import java.util.ArrayList;

public class ArrayReverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //fills the list so it can be swapped
        for(int i = 0; i < 12; i++) {
            list.add(i);
        }
        //print ArrayLists
        System.out.println("The original ArrayList is: " + list.toString() + ".");
        ArrayList<Integer> reverseList = reverse4(list);
        System.out.println("The reversed ArrayList is: " + reverseList.toString() + ".");
    }
    //reverses every 4 elements in an ArrayList
    public static ArrayList<Integer> reverse4(ArrayList<Integer> list) {
        int temp = 0;
        //flips every 4 elements around
        for(int i = 0; i < list.size() - 3; i += 4) {
            temp = list.get(i);
            list.set(i, list.get(i + 3));
            list.set(i + 3, temp);
            temp = list.get(i + 1);
            list.set(i + 1, list.get(i + 2));
            list.set(i + 2, temp);
        }
        return list;
    }

}
