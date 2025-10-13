package Tasks;
// Find the Maximum of Two Numbers.
import java.util.Scanner;
public class Max2_Numbers {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number1");
        int number1=scanner.nextInt();
        System.out.println("Enter number2");
        int number2=scanner.nextInt();
        if (number1==number2){
            System.out.println("Both numbers are equal");
        }
        else {
            int max = (number1 > number2) ? number1 : number2;
            System.out.println("Maximum of 2 numbers"+max);
         }



    }
}
