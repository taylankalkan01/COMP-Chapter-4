/*
Description:
* This program uses the Euclidean algorithm to calculate the greatest common divisor of two positive integers.
 */
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //declare variables
        int m, n, temp, r;

        //input
        System.out.print("Enter two positive integers: ");
        m = keyboard.nextInt();
        n = keyboard.nextInt();

        //step 1. m is larger # and n is smaller #
        if ( m < n) { //need to swap m and n
            temp = m;
            m = n;
            n = temp;
        }

        //step 2
        r = m % n;

        //step 3
        while ( r != 0){
            m = n;
            n = r;

            r = m % n;  //repeat step 2
        }

        //print
        System.out.println("\nGCD: " + n);
    }
}
