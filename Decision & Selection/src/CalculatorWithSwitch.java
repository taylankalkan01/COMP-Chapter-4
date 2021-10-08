/*
Description:
This program prompts the user to input two operands and a operator, then uses a switch structure to evaluate the operator to determine which operation to perform (+, -, *, or /), and calculates the result based on the operator.
 */
import java.util.Scanner;

public class CalculatorWithSwitch {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //declare variables
        double n1, n2, result = 0;
        char operator;
        boolean flag = true;

        //input
        System.out.print("Enter first operand: ");
        n1 = keyboard.nextDouble();

        System.out.print("Enter second operand: ");
        n2 = keyboard.nextDouble();

        System.out.print("Enter operator(+, -, *, or /): ");
        operator = keyboard.next().charAt(0);

        //switch
        switch (operator) {
            case '+':

                result = n1 + n2;

                break;


            case '-':

                result = n1 - n2;

                break;

            case '*':

                result = n1 * n2;

                break;

            case '/':

                if (n2 == 0) {
                    System.out.println("Error, denominator must be non-zero.");
                    flag = false;
                } else {
                    result = n1 / n2;
                }

                break;

            default:

                System.out.println("Invalid operator!");
                flag = false;

        } //end switch

        if ( flag ) {
            System.out.println(n1 + " " + operator + " " + n2 + " = " + result);
        }

    }//end main
}
