
package Coding_Challenge;
//Create a class "Person" with attributes "name" and "age". Create two instances and print their details.

public class Person {
    // Attributes
    private String name;
    private int age;

    // Constructor to initialize the attributes
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the details
    public void displayDetails() {
        System.out.print("Name: " + name + ", Age: " + age + " ");
    }

    // Main method to create instances and call the display method
    public static void main(String[] args) {
        // Create first instance (John, 25)
        Person john = new Person("John", 25);

        // Create second instance (Alice, 30)
        Person alice = new Person("Alice", 30);

        // Print details for John
        john.displayDetails();

        // Print details for Alice
        alice.displayDetails();

    }
}
