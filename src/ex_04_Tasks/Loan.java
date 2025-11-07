package ex_04_Tasks;
/* Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)
        Take the below User info and store it into the variables:
            Age (integer),Salary (double or float),Credit Score (integer)
    Age Validation:
              :- Check if the age is a positive integer
              :- Ensure the age is at least 18 years old.
              :- Max age can be 80.
    Salary Validation:
              :- Check if the salary is a positive number.
              :- Define a minimum salary threshold (e.g., 30,000).
    Credit Score Validation:
              :- Check if the credit score is a positive integer.
              :- Define a minimum credit score threshold (e.g., 650).
              :- Max credit score threshold (e.g., 850). */

import java.util.Scanner;

public class Loan{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take Inputs
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter Credit Score: ");
        int creditScore = scanner.nextInt();

        // Step 2: Validate and check eligibility
        boolean eligible = validateAge(age)
                & validateSalary(salary)
                & validateCreditScore(creditScore);

        // Step 3: Final Eligibility Message
        if (eligible) {
            System.out.println("You are eligible for a loan.");
        } else {
            System.out.println("You are not eligible for a loan.");
        }

        scanner.close();
    }

    // Function to validate Age
    public static boolean validateAge(int age) {
        if (age < 18 || age > 80) {
            System.out.println("- Age must be between 18 and 80.");
            return false;
        }
        return true;
    }

    // Function to validate Salary
    public static boolean validateSalary(double salary) {
        if (salary < 30000) {
            System.out.println("- Salary must be at least 30,000.");
            return false;
        }
        return true;
    }

    // Function to validate Credit Score
    public static boolean validateCreditScore(int creditScore) {
        if (creditScore < 650 || creditScore > 850) {
            System.out.println("- Credit score must be between 650 and 850.");
            return false;
        }
        return true;
    }
}
