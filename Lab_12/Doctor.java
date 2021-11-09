//Name: Lance Cross Date: 11/9/21 ID: 002634761
//creates student objects that are an extension of the Human class

public class Doctor extends Human {
    
    //instance variables
    private String speciality;
    private int years;

    //constructor
    public Doctor(double weight, int age, double height, String speciality, int years) {
        super(weight, age, height);
        this.speciality = speciality;
        this.years = years;
    }

    //returns speciality
    public String getSpeciality() {
        return speciality;
    }
    //returns years
    public int getYears() {
        return years;
    }
    //returns salary based on number of years
    public int getSalary() {
        if(years == 1) {
            return 40000;
        } else {
            return 5000 * (years - 1) + 40000; 
        }
    }
    //returns string representation of Doctor class
    public String toString() {
        return "Doctor(Speciality = " + speciality + ", Height = " + getHeight() + ", Weight = " + getWeight() + ", Salary = " + getSalary() + ")";
    }
}
