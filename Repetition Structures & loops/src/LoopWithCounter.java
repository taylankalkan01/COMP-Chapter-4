/*
Description:
* There are 10 students, each with a test score.
* This program inputs 10 test scores, calculates the average score, and finds the highest score
(assume there is no tie).
* Because we know in advance that there are 10 students, so the counter-controlled while loop is used.
 */

import java.util.Scanner;

public class LoopWithCounter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //declare variables
        int score, i, sum = 0;
        double average;
        int highest = Integer.MIN_VALUE;

        //define constants
        final int NUM_STUDENTS = 10;

        i = 0;

        while (i < NUM_STUDENTS) {

            //input a test score
            System.out.print("Enter a test score (0-100) for student #" + (i + 1) + ": ");
            score = keyboard.nextInt();

            if (score < 0 || score > 100) {
                System.out.println("Invalid input, try again!");
            } else {
                if (score > highest) {
                    highest = score;
                }

                sum += score;

                i++;
            }
        } //end while

        average = sum / (double) NUM_STUDENTS;

        //print
        System.out.printf("%nAverage Score: %.2f", average);
        System.out.println("\nHighest Score: " + highest);
    }
}
