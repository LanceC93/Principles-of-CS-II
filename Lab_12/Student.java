//Name: Lance Cross Date: 11/9/21 ID: 002634761
//creates student objects that are an extension of the Human class

public class Student extends Human {
    
    //instance variables
    private String major;
    private double gpa;
    private int creditHours;

    //constructor
    public Student(double weight, int age, double height, String major, double gpa, int hours) {
        super(weight, age, height);
        this.major = major;
        this.gpa = gpa;
        creditHours = hours;
    }

    //returns major
    public String getMajor() {
        return major;
    }
    //returns gpa 
    public double getGpa() {
        return gpa;
    }
    //returns the year of student based on credit hours
    public String getYear() {
        if(creditHours < 32) {
            return "freshman";
        } else if(creditHours < 64) {
            return "sophomore";
        } else if(creditHours < 96) {
            return "junior";
        } else {
            return "senior";
        }
    }
    //returns String representation of Student object
    public String toString() {
        return "Student(Major = " + major + ", GPA = " + gpa + ", Year = " + getYear() + ", Age = " + getAge() + ")";
    }
}
