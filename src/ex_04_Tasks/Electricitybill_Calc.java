package ex_04_Tasks;
/* Electricity Bill Calculation (Based on Units Consumed)
:- take the input from the user of Units.
 Rate Structure:
Define the rate structure for calculating the bill based on the number of units consumed.
:-  First 100 units: 0.50Rs per unit
:-  Next 100 units (101-200): 0.75Rs per unit
:-  Next 100 units (201-300): 1.20Rs per unit
:-  Above 300 units: 1.50Rs per unit */


import java.util.Scanner;

public class Electricitybill_Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter units: ");
        int units = scanner.nextInt();

        double totalBill = calculateBill(units);

        System.out.printf("Total Electricity Bill: Rs %.2f%n" ,totalBill);
    }

        public static double calculateBill (int units){
            double billAmount = 0;
            if (units < 0) {
                System.out.println("Invalid input. Units cannot be negative.");
                return 0;
            }
            else if (units <= 100) {
                billAmount = units * 0.50;
            } else if (units <= 200) {
                billAmount = (100 * 0.50) + ((units - 100) * 0.75);
            } else if (units <= 300) {
                billAmount = (100 * 0.50) + (100 * 0.75) + ((units - 200) * 1.20);
            } else {
                billAmount = (100 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 300) * 1.50);
            }

            return billAmount;
        }
    }
