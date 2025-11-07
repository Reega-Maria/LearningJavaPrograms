package ex_04_Tasks;

//ATM Withdrawal Simulation. (Follow Below Steps to Write Program)
//       Steps to Write the Program
//1️⃣ Initialize the account balance with a fixed amount (e.g., ₹10,000).
//2️⃣ Take user input for the amount they want to withdraw.
//3️⃣ Check withdrawal conditions:
//The amount should be greater than zero.
//The amount should be a multiple of 100 (common ATM rule).
//The amount should not exceed the account balance.
//4️⃣ Deduct the amount from the balance if conditions are met.
//5️⃣ Display the updated balance or an error message if the withdrawal fails.

import java.util.Scanner;

public class Atm_Withdrawl {
        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Amount want to withdraw");
            int amount =scanner.nextInt();
            int account_balance=10000;
                    if (amount <= 0) {
                        System.out.println("❌ Invalid amount. Must be greater than zero.");
                    } else if (amount % 100 != 0) {
                        System.out.println("❌ Amount must be a multiple of 100.");
                    } else if (amount > account_balance) {
                        System.out.println("❌ Insufficient balance.");
                    } else {
                        // Step 4: Deduct amount
                        account_balance -= amount;
                        // Step 5: Display updated balance
                        System.out.println("Withdrawal successful!");
                        System.out.println("Current balance: ₹" + account_balance);
                    }

                    scanner.close();
                }
            }





