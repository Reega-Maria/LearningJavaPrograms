package ex_04_Tasks;
//Check if a Number is Positive or Negative.
import java.util.Scanner;
public class Positive_Negative {
        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the number");
            int num =scanner.nextInt();
            String result=(num>0)?"Positive"
                           :(num==0)?"Zero"
                            :"Negative";
            System.out.println("The number is :" +result);
}
}

