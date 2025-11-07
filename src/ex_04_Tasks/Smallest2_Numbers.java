package ex_04_Tasks;
import java.util.Scanner;
public class Smallest2_Numbers {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the 2 numbers");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        if(num1<num2){
            System.out.println("num1 is smaller"+num1);
        }
        else if(num2<num1){
            System.out.println("num2 is smaller"+num2);
        }
        else{
            System.out.println("Both numbers are equal");
        }
    }
}
