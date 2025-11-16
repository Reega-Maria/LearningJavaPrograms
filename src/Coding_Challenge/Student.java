package Coding_Challenge;
//Implement a class "Student" with attributes "name", "rollNo", and "section".
// Add a method to print student details.
public class Student {
    // Attributes
    private String name;
    private int rollNo;
    private String section;

    // Constructor to initialize the attributes
    public Student(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    // Method to display the details
    public void printDetails() {
        System.out.print("Student: " + name + ", Roll No: " + rollNo + ", Section: " + section);
    }

    // Main method to create instances and call the display method
    public static void main(String[] args) {
        // Create student instance as per the example
        Student bob = new Student("Bob", 101, "A");

        // Print the details
        bob.printDetails();
    }
}
