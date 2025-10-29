package Tasks;
import java.util.Scanner;
public class ArmstrongNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number:");
            int num = scanner.nextInt();

            int original = num;
            int sum = 0;
            int digits=0;

            // Step 1: Count digits
            int temp=num;
            while(temp!=0) {
                temp = temp / 10;
                digits++;
            }
           // int digits = String.valueOf(num).length();

            // Step 2: Calculate sum of powered digits
            temp=num;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp=temp/ 10;
            }

            // Step 3: Compare
            if (sum == original) {
                System.out.println(original + " is an Armstrong number.");
            } else {
                System.out.println(original + " is not an Armstrong number.");
            }

            scanner.close();
        }
    }


