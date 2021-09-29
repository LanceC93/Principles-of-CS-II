//Name: Lance Cross Date: 9/28/21 ID: 002634761
//allows the creation of a ISBN object represent an ISBN number
public class ISBN
{ 
    private String digits;
    private String checkSymbol;

    //constructs a new ISBN with the given fields
    public ISBN(String digits, String checkSymbol) {
        this.digits = digits;
        this.checkSymbol = checkSymbol;
    }

    // getter/accessors that returns the fields' values
    public String getDigits() {
        return digits;
    }

    public String getCheckSymbol() {
        return checkSymbol;
    }

    //returns true if the ISBN is valid else returns false. You will
    //need to extract each digit to calculate checksum. You can use
    //charAt or substring methods then convert them to integer and
    //The algorithm to generate the checksum is given below.
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
    // ISBN should be printed in correct format eg: 0-13-394302-X.
    public String toString() {
        return getDigits().charAt(0) + "-" + getDigits().substring(1,3) + "-" + getDigits().substring(3) + "-" + getCheckSymbol();
    }
}
