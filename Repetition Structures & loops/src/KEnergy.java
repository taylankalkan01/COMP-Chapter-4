/*
*Description:
* Write a program that asks the user to enter m and v,
* then calculates and outputs the kinetic energy if the user inputs are valid. If the user inputs are invalid, outputs an error message.
 */

import java.util.Scanner;

public class KEnergy {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double m, v, k,average = 0;
        boolean check = false;

        while (!check) {

            System.out.println("\nEnter the mass of the object in Kilograms (-1 to exit): ");
            m = keyboard.nextDouble();

            if (m == -1) {
                check = true;
                System.out.println("The average is: " + average);
            } else {
                System.out.print("\nEnter the velocity of the object in meters per second: ");
                v = keyboard.nextDouble();

                k = (m * v * v) / 2.0;
                average = k;

                if (m < -2 || v < 0) {

                    System.out.println("***Invalid input. Both mass and velocity must be greater than 0.");
                } else {
                    System.out.printf("\nThe kinetic energy of the object is %.2f ", k);
                    average = k;
                }

            }
        }


    }
}


