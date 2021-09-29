//Name: Lance Cross Date: 9/28/21 ID: 002634761
//allows the creation of a ISBN object represent an ISBN number
public class ISBN
{ 
    private String digits;
    private String checkSymbol;

    //constructs a new ISBN
    public ISBN(String digits, String checkSymbol) {
        this.digits = digits;
        this.checkSymbol = checkSymbol;
    }

    //gets ISBN fields
    public String getDigits() {
        return digits;
    }

    public String getCheckSymbol() {
        return checkSymbol;
    }

    //returns true if the ISBN is valid, returns false if it isnt
    public boolean isValid() {
        int sum = 0;
        //checks if the digits are the right length
        if(getDigits().length() != 9) {
            return false;
        }
        //goes through each digit
        for(int i = 0; i < 9; i++) {
            //checks if the first 9 digits are actually numbers
            if(!(getDigits().charAt(i) > 47) || !(getDigits().charAt(i) < 58)) {
                return false;
            }
            sum += (getDigits().charAt(i) - 48) * (i + 1);
        }
        sum %= 11;
        //checks if the 10th digit is the same as the checkSum
        if(((!(getCheckSymbol().charAt(0) > 47) || !(getCheckSymbol().charAt(0) < 58)) && sum != (getCheckSymbol().charAt(0) - 48)) && getCheckSymbol().charAt(0) != 'X') {
            return false;
        } else {
            return true;
        }
    }

    // returns the string representation of the ISBN
    public String toString() {
        return getDigits().charAt(0) + "-" + getDigits().substring(1,3) + "-" + getDigits().substring(3) + "-" + getCheckSymbol();
    }
}
