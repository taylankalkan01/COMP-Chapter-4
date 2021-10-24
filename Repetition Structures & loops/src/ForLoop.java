/*
Description:
This program uses several for loops to print a sequence of numbers and calculates the sum and average of these numbers.
 */

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //declare variables
        int n, sum = 0, count = 0;
        double average;

        //input
        System.out.print("Enter a positive integer: ");
        n = keyboard.nextInt();

        //use a for loop to print every number from n to 50;
        for (int i = n; i <= 50; i++) {

            System.out.printf("%-5d", i);

            sum += i;
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

        sum = 0;
        count = 0;

        for (int i = 50; i >= n; i--) {

            System.out.printf("%-5d", i);

            sum += 1;
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

        sum = 0;
        count = 0;

        for (int i = n; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.printf("%-5d", i);

                sum += i;
                count++;

                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\nSum: " + sum);
        average = sum / (double) count;
        System.out.println("Average: " + average);

    }
}



