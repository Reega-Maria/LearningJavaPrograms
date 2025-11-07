package ex_04_Tasks;
/* Calculate Employee Net Salary (Basic Pay, HRA, DA, Tax Deductions,) */
import java.util.Scanner;
public class Employee_Netsalary {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Basic Salary: ");
            double basic = scanner.nextDouble();

            double hra = 0.20 * basic;
            double da = 0.10 * basic;
            double gross = basic + hra + da;
            double tax;

            if (gross <= 50000)
                tax = 0;
            else
                tax = 0.10 * gross; //Tax = 10% if Gross > 50,000,

            double net = gross - tax;
            System.out.println("Net Salary = Rs " + net);
        }
    }



