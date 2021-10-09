/*
Description:
* This program prompts the user to input a test score and then uses a switch structure to determine the student grade based on the score.
 */

import java.util.Scanner;

public class GradeBookWithSwitch {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        //declare variables
        int score;
        char grade = 'U';

        System.out.print("Enter test score (0 - 100): ");
        score = keyboard.nextInt();

        switch (score / 10) {
            case 10, 9 -> grade = 'A';
            case 8 -> grade = 'B';
            case 7 -> grade = 'C';
            case 6 -> grade = 'D';
            case 5, 4, 3, 2, 1, 0 -> grade = 'F';
            default -> System.out.println("Invalid score");
        }

        if (grade != 'U') {
            System.out.println("\nGrade: " + grade);
        }


    }
}
