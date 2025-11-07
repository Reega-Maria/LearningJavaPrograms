package ex_04_Tasks;
//Check if a Number is Even or Odd.
import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is Odd");

        }
    }
}


