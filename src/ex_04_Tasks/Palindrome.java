package ex_04_Tasks;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the word or number");
        String input=scanner.nextLine();
        String rev="";
        for(int i=input.length()-1;i>=0;i--) {
            rev = rev + input.charAt(i);
        }
            if (input.equalsIgnoreCase(rev)) {
                System.out.println(input + " is a palindrome.");
            } else {
                System.out.println(input + " is not a palindrome.");
            }

        }

    }

