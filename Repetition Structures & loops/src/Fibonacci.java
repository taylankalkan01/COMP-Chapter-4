/*
Description:
* The Fibonacci sequence of numbers start with 0 and 1, then the following number is the addition of two previous numbers.
* This program inputs an index (position) and then calculates Fibonacci number at this index.
 */

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        //create input object
        Scanner keyboard = new Scanner(System.in);

        //declare variables
        int index, result = 0, i;

        //input
        System.out.print("Enter an index: ");
        index = keyboard.nextInt();

        //calculate
        if (index == 0 || index == 1) {
            result = index;
        }

        i = 2;

        //use a while loop to calculate the fib. number at index
        int p1 = 0;
        int p2 = 1;

        while (i <= index) {
            result = p1 + p2;

            //update p1 and p2
            p1 = p2;
            p2 = result;

            i++;
        }
        System.out.println("\nFibonacci number at " + index + ": " + result);
    }
}
