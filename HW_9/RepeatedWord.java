//Name: Lance Cross Date: 11/15/2021 ID: 002634761
//counts the most repeated word in a text file
import java.util.*;
import java.io.*;

public class RepeatedWord {
    public static void main(String[] args) throws FileNotFoundException {
        //creates a Scanner to scan the .txt file
        File file = new File("text.txt");
        Scanner console = new Scanner(file);
        //creates a map to hold occurences
        Map<String, Integer> count = new HashMap<String, Integer>();
        //holds the next string in the text file
        String nextStr = console.next();
        //sets first word as max
        count.put(nextStr, 1);
        //holds the key for the max count
        String maxKey = nextStr;

        //adds words and their occurences into the map, sets max
        while(console.hasNext()) {
            //iterates to the next word in the text file
            nextStr = console.next();
            //adds 1 to count if key is in map, adds to map otherwise
            if(count.containsKey(nextStr)) {
                count.put(nextStr, count.get(nextStr) + 1);
            } else {
                count.put(nextStr, 1);
            }
            //checks if the count is higher than maximum
            if(count.get(nextStr) > count.get(maxKey)) {
                maxKey = nextStr;
            }
        }

        //prints the results
        System.out.println("Most Repeated Word: " + maxKey);
        System.out.println("Number of Occurences: " + count.get(maxKey));
    }
}