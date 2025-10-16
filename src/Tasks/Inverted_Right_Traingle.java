package Tasks;
import java.util.Scanner;
public class Inverted_Right_Traingle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n for pattern.Ex:n=3");
        int n = scanner.nextInt();
        for (int i = n; i >= 1; i--) {     //The i loop says “I’ll make 3 rows.”
            for (int j = 1; j <= i; j++) {  //j loop says “I’ll print i stars in each row.”
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
