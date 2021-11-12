//Name: Lance Cross Date: 11/15/2021 ID: 002634761
//counts number of occurences of a word in a string

public class OccurenceCount {
    public static void main(String[] args) {
        //defines word that is being counted
        String word = "map";
        //defines string that will be searched
        String str = "It is not down on any map true places never are.";
        //splits str into words
        String split[] = str.split(" ");
        //counts number of occurences
        int count = 0;
        //searches array for strings that match the word
        for(String i : split) {
            if(i.equals(word)) {
                count++;
            }
        }
        //prints count
        System.out.println("The count of the word is " + count + ".");
    }
}