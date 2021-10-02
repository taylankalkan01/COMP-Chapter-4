/*
Description:
* This program is similar to LoopWithSentinel program.
* We use a boolean value flag to control the loop execution.
* Initially the flag is set to true.
* If the user input is equal to the sentinel value, the flag is set to false to end the loop.
 */

import java.util.Scanner;

public class LoopWithFlag {
    public static void main(String[] args) {

        //create input object
        Scanner keyboard = new Scanner(System.in);

        //declare variables
        int score, i, sum = 0;
        double average;
        int highest = Integer.MIN_VALUE;
        boolean flag = true;

        //define constant
        final int SENTINEL = -1;

        i = 0;

        while (flag) {

            //input a test score
            System.out.print("Enter a test score (0-100) for student #" + (i + 1) + "  (-1 to end): ");
            score = keyboard.nextInt();

            if (score == SENTINEL) {
                flag = false;
            } else {
                if (score < 0 || score > 100) {
                    System.out.println("Invalid input, try again!");
                } else {

                    if (score > highest) {
                        highest = score;
                    }

                    sum += score;

                    i++;

                }

            }

        }//end while

        if (i != 0) {

            average = sum / (double) i;

            //print
            System.out.printf("%nAverage Score: %.2f", average);
            System.out.println("\nHighest Score: " + highest);
        } else {
            System.out.println("\nNo Student.");
        }

    }
}
