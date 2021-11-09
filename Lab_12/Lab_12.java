//Name: Lance Cross Date: 11/9/21 ID: 002634761
//this is the client code to show the Student and Dcotor classes

public class Lab_12 {
    public static void main(String[] args) {
        //creates objects
        Student alex = new Student(150, 18, 170, "CS", 3.4, 54);
        Doctor jack = new Doctor(179, 40, 173, "Dermatology", 4);

        //prints them out as strings
        System.out.println(alex);
        System.out.println(jack);
    }    
}
