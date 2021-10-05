/*
Description:
* The purpose of this program is to use a one-way selection structure to determine the smallest value among three integers.
 */

import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //declare variables
        int n1, n2, n3, min;

        //input
        System.out.println("Enter 3 integers: ");
        n1 = keyboard.nextInt();
        n2 = keyboard.nextInt();
        n3 = keyboard.nextInt();

        //determine which is the smallest
        min = n1; //assume n1 is the smallest

        if (n2 < min) {
            min = n2;
        }

        if (n3 < min) {
            min = n3;
        }
        System.out.println("\nSmallest Value: " + min);

    }
}
