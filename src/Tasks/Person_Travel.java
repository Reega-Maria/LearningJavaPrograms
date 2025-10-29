package Tasks;
/* Find if a Person Can Travel Based on Visa Status and Age.
 take the input from the user for
Age (integer).
Visa Status (String or boolean).
Check Eligibility:
:- If age is 18 or older and visa status is valid, the person can travel.
Otherwise, the person cannot travel.
Validation Criteria
Age: - Must be a non-negative integer.
:- Should be greater than or equal to 18 to be eligible to travel.
Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").
:- You can also use a boolean where true indicates a valid visa and false indicates an invalid visa. */
import java.util.Scanner;

    public class Person_Travel {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            // Validate age first
            if (age < 0) {
                System.out.println("Invalid age. Age cannot be negative.");
                return;
            }

            System.out.print("Enter visa status (valid/invalid): ");
            String visaStatus = scanner.next();

            // Call function
            boolean eligible = canTravel(age, visaStatus);

            // Print result
            if (eligible) {
                System.out.println("Person can travel.");
            } else {
                System.out.println("Person cannot travel.");
            }
        }

        // Function to check travel eligibility
        public static boolean canTravel(int age, String visaStatus) {
            // Validate visa input
            if (!visaStatus.equalsIgnoreCase("valid") && !visaStatus.equalsIgnoreCase("invalid")) {
                System.out.println("Invalid visa status. Please enter 'valid' or 'invalid'.");
                return false;
            }

            // Check conditions
            if (age >= 18 && visaStatus.equalsIgnoreCase("valid")) {
                return true;
            } else {
                return false;
            }
        }
    }


