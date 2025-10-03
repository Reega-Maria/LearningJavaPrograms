package ex_11_While;
import java.util.Random;
import java.util.Scanner;
public class Lab122_While_Guessing_Game {
        public static void main(String[] args) {
            // Guess a number between 1 and 100
            // n = 56
            //  90 , 60 ,  50 ->  50 to 60 yes

            Random random = new Random();
            int numberTOGuess = random.nextInt(101);//generates a number between 0–100(inclusive)

//        System.out.println(numberTOGuess);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number");
            int guess;
            int attempts = 0;


            while (true){
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input! Please enter a number.");
                    scanner.next(); // Consume invalid token, you type a letter like abc, it says "Invalid input!" and asks again.
                    continue;
                }

                guess = scanner.nextInt();// Stores the number you typed in guess.
                attempts++;

                if(guess < 1 || guess > 100){
                    System.out.println("Please enter a number between 1 and 100.");
                    continue;
                }


                if(guess < numberTOGuess){
                    System.out.println("Too low, try again");
                }else if(guess > numberTOGuess) {
                    System.out.println("Too high, try again");
                }
                else{
                    System.out.println("Correct! You guessed it in " + attempts + " attempts");
                    break;
                }














            }






        }
    }
