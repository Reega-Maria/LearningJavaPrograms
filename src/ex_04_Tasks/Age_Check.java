package ex_04_Tasks;

import java.util.Scanner;
public class
Age_Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        if (age <= 0) {
            System.out.println("Invalid age");
        } else {
            String result = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
            System.out.println(result);

            scanner.close();
        }
    }
}
