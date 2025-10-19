package Tasks;

import java.util.Scanner;

public class Smallest3_Numbers {
        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the number1");
            int num1=scanner.nextInt();
            System.out.println("Enter the number2");
            int num2=scanner.nextInt();
            System.out.println("Enter the number3");
            int num3=scanner.nextInt();
            if (num1 == num2 && num2 == num3) {
                System.out.println("All three numbers are equal: " + num1);
            }
            else if((num1<=num2)&&(num1<=num3)){
                System.out.println("number1 is smaller"+num1);
            }
            else if((num2<=num3)&&(num2<=num1)){
                System.out.println("number2 is smaller"+num2);
            }
            else{
                System.out.println("number3 is smaller"+num3);
            }
        }
    }


