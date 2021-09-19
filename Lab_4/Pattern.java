//Name: Lance Cross Date: 09/14/21 ID: 002634761
//creates the pattern given on the lab instructions
public class Pattern {
    public static void main(String[] args) {
        //determines what row it is printing on
        for(int i = 5; i >= 1; i--) {
            //prints out the necessary numbers for each line
            for(int j = i; j <= 5; j++) {
                System.out.print(j + " ");
            }
            //prints an extra line if the row is greater than 2
            if(i > 2) {
                System.out.println();
            }
            System.out.println();
        }
    }
}
