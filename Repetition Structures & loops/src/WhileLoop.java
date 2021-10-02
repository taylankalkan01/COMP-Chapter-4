/*
Description:
* This program uses several while loops to print a sequence of numbers
and calculates the sum and average of these numbers.
*/

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //declare variables
        int n, i, sum = 0, count = 0;
        double average;

        //input
        System.out.print("Enter a positive integer: ");
        n = keyboard.nextInt();

        //use a while loop to print every number from n to 50
        i = n;

        while (i <= 50) {
            System.out.printf("%-5d", i);

            sum += i;

            i++;

            count++;

            if (count % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println("\nSum: " + sum);

        average = sum / (double) count;

        System.out.println("Average: " + average);

        //print every number from 50 to n
        System.out.println("\n");

        i = 50;
        sum = 0;
        count = 0;

        while (i >= n) {
            System.out.printf("%-5d", i);

            sum += i;

            i--;

            count++;

            if (count % 10 == 0) {
                System.out.println();
            }

        }

        System.out.println("\nSum: " + sum);

        average = sum / (double) count;

        System.out.println("Average: " + average);


        //print every even number from n to 50
        System.out.println("\n");

        i = n;
        sum = 0;
        count = 0;

        while (i <= 50) {

            if (i % 2 == 0) {

                System.out.printf("%-5d", i);

                sum += i;

                count++;

                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            i++;
        }

        System.out.println("\nSum: " + sum);

        average = sum / (double) count;

        System.out.println("Average: " + average);

    }//end main
}//end class
