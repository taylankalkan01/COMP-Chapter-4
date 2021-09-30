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
