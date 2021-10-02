/*
Description:
* This program inputs a positive integer n and then calculates n!.
 */

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        //create input object
        Scanner keyboard = new Scanner(System.in);

        //declare variables
        int n, i;
        long result = 1;

        //input
        System.out.print("Enter a positive integer: ");
        n = keyboard.nextInt(); // 5

        //calculate n!
        i = n;
        while (i > 1) {
            result *= i; //result = result * i

            i--;
        }

        //print
        System.out.printf("%n" + n + "! = %,d", result);

    }
}
