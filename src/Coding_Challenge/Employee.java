package Coding_Challenge;

//Implement encapsulation in a class "Employee" with private attributes "id", "name", and "salary".
// Add getter and setter methods.

public class Employee {
    // Private Attributes (Encapsulation)
    private int id;
    private String name;
    private double salary;

    // Constructor for easy object creation
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Public Getter Methods (Read Access)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Public Setter Methods (Write Access/Modification)

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Error: Salary cannot be negative.");
        }
    }

    // Optional: Display method to match the output example
    public void printDetails() {
        System.out.println("Employee ID: " + id + " Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }


    public static void main(String[] args) {
        // Create an Employee instance
        Employee john = new Employee(1, "John Doe", 50000.0);

        // Display initial details
        john.printDetails();

        // Example of using a setter
        john.setSalary(55000.0);
        System.out.println("\n---After salary update---");

        // Example of using a getter
        System.out.println("Updated Salary: " + john.getSalary());
    }
}
