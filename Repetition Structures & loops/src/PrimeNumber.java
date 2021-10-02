/*
Description:
* A prime number is a positive integer that has exactly two positive integer factors, 1 and itself.
* This program inputs a positive integer n and determines whether or not n is a prime number.
 */
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        //create input object
        Scanner keyboard = new Scanner(System.in);

        //declare variables
        int n, i;
        boolean flag = true;

        //input
        System.out.print("Enter a positive integer: ");
        n = keyboard.nextInt();

        //determine if n is a prime number
        i = 2;

        while (i <= (n / 2)) {
            if (n % i == 0) {
                System.out.println("No, " + n + " is not a prime number.");
                System.out.println("Because " + n + " is divisible by " + i);

                flag = false;

                break;
            }

            i++;
        }
        if (flag) {
            System.out.println("Yes, " + n + "is a prime number.");
        }

    }
}
