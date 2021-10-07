/*
Description:
* This program prompts the user to input a test score and then uses a multi-selection structure to determine the student grade based on the score.
 */
import java.util.Scanner;

public class MultiSelection {
    public static void main(String[] args) {

        //create input object
        Scanner keyboard = new Scanner(System.in);

        //declare variables
        int score;
        char grade;

        //input
        System.out.println("Enter test score (0-100): ");
        score = keyboard.nextInt();

        //determine the grade
        if (score < 0 || score > 100) {
            System.out.println("Invalid input, test score must be (0-100)");
        } else {
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("\nGrade: " + grade);
        }

    }
}