import java.util.Scanner;

public class LoopWithSentinel {
    public static void main(String[] args) {
        //create input object
        Scanner keyboard = new Scanner(System.in);

        //declare variables
        int score, i, sum = 0;
        double average;
        int highest = Integer.MIN_VALUE;

        //define constant
        final int SENTINEL = -1;

        i = 0;

        //input a test score
        System.out.print("Enter a test score (0-100) for student #" + (i + 1) + "  (-1 to end): ");
        score = keyboard.nextInt();

        while (score != SENTINEL) {

            if (score < 0 || score > 100) {
                System.out.println("Invalid input, try again!");
            } else {

                if (score > highest) {
                    highest = score;
                }

                sum += score;

                i++;
            }

            System.out.print("Enter a test score (0-100) for student #" + (i + 1) + "  (-1 to end): ");
            score = keyboard.nextInt();

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
