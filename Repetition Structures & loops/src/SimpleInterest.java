import java.util.Scanner;

/*
Description:
* A simple interest on a loan is calculated by the following formula.
* This program prompts the user to enter the principal, annual interest rate, time period in days for several loans, and calculates the simple interest charge for each loan.
* The number of loans is unknown. So a sentinel-controlled loop is used to control the loop execution.
 */
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //declare variables
        double principal, rate, charge;
        int days;

        System.out.print("\nEnter loan principal (-1 to end): ");
        principal = keyboard.nextDouble();

        while (principal != -1) {
            System.out.print("Enter interest rate: ");
            rate = keyboard.nextDouble();

            System.out.print("Enter days: ");
            days = keyboard.nextInt();

            if (principal <= 0 || rate <= 0 || days <= 0) {
                System.out.println("Invalid input, all three input must be greater than zero.");
            } else {
                charge = principal * rate * days / 365;
                System.out.printf("%n Interest Charge: $%.2f", charge);
            }
            System.out.print("\n\nEnter loan principal (-1 to end): ");
            principal = keyboard.nextDouble();
        }
    }
}
