package ex_04_Tasks;
/*Check if a Number is Divisible by 5 and 11 */
import java.util.Scanner;
public class Num_divisible5_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println(num + " is divisible by 5 and 11");
        } else {
            System.out.println(num + " is not divisible by 5 and 11");
        }
    }
}
