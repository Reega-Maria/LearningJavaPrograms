package ex_04_Tasks;
import java.util.Scanner;
//Check if a Triangle is Valid Based on Three Sides.
public class Traingle_Valid {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter first side: ");
            int a = scanner.nextInt();

            System.out.println("Enter second side: ");
            int b = scanner.nextInt();

            System.out.println("Enter third side: ");
            int c = scanner.nextInt();

            // Check triangle validity
            if ((a + b > c) && (a + c > b) && (b + c > a)) {
                System.out.println("The triangle is valid.");
            } else {
                System.out.println("The triangle is not valid.");
            }

            scanner.close();
        }
    }


