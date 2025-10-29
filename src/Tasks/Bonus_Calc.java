package Tasks;
/*  Calculate Bonus Based on Salary and Years of Experience.
  :- take the salary and Year info from the User.
Implement Bonus Calculation Logic:
Define the bonus structure based on salary and years of experience.
:- If years of experience is less than 1 year: No bonus.
:- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
:- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
:- If years of experience is greater than 6 years: Bonus is 15% of the salary. */
import java.util.Scanner;
public class Bonus_Calc {
public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the expierence");
    double exp= scanner.nextDouble();
    if (exp < 0) {
        System.out.println("Invalid input! Experience cannot be negative.");
        return;
    }
    System.out.println("Enter the salary");
    double salary=scanner.nextDouble();
    double bonus= CalculateBonus(exp,salary);
    System.out.printf("Bonus is Rs %.2f%n",bonus);
}
public static double CalculateBonus(double exp,double salary) {
    double bonus = 0;
if (exp < 1) {
        System.out.println("No bonus");
    } else if (exp >= 1 && exp <= 3) {
        bonus = salary * 0.05;
    } else if (exp >= 4 && exp <= 6) {
        bonus = salary * 0.10;
    } else if (exp > 6) {
        bonus = salary * 0.15;
    }
return bonus;
}
}
