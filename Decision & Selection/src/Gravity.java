import java.util.Scanner;

import static java.lang.Math.pow;

/*
Description:
* Write a program that prompts the user to enter m, n, and r,
then calculates and prints the Force of Gravity if the user inputs are valid.
*/
public class Gravity {

    public static void main(String[] args) {

        //declare variables
        double m, n, r;
        double g = 6.67 * pow(10, -11);


        //create input object
        Scanner inputScan = new Scanner(System.in);

        System.out.println("Enter mass of first object in kg: ");
        m = inputScan.nextDouble();

        System.out.println("Enter mass of second object in kg: ");
        n = inputScan.nextDouble();

        System.out.println("Enter distance between object in meters: ");
        r = inputScan.nextDouble();

        //define constant
        final double FORCE_OF_GRAVITY;


        if (m <= 0 || n <= 0 || r <= 0) {
            System.out.println("Invalid input. The values should be greater than zero.");
        } else {
            //CALCULATE
            FORCE_OF_GRAVITY = (g * m * n) / pow(r, 2);

            //PRINT
            System.out.println("The force of gravity between the two objects is "
                                       + FORCE_OF_GRAVITY + " Newtons.");

        }


    }
}