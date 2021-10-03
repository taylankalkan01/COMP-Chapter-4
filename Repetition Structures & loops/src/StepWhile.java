/*
Description:
a) Prompt the user to input two distinct integers: n1 and n2.
b) If the user enters the negative number(s), convert it/them to positive number(s).
c) If n1 is greater than n2, swap them (make sure n1 is smaller than n2).
-Print n1 and n2.
-Then, use four separate while loops to do the following:
d) Use a while loop to output all the numbers divisible by 5 from n1 and n2 inclusive and the sum of these numbers.
e) Use a while loop to output all the odd numbers from n2 and n1 (large to small) inclusive and the average of these numbers.
f) Use a while loop to output the table of each even integer and its square between 2 and 16 inclusive.
g) Use a while loop to print all the uppercase letters.
*/

import java.util.Scanner;

public class StepWhile {
    public static void main(String[] args) {

        //create input object
        Scanner keyboard = new Scanner(System.in);

        //declare variables
        int n1, n2;


        //print
        System.out.println("***********Step A, B, and C**********************");
        System.out.println("Enter first integer: ");  //-25
        n1 = keyboard.nextInt();

        System.out.println("Enter first integer: ");  //-4
        n2 = keyboard.nextInt();

        //Convert numbers to positive if user has entered negative number
        if (n1 < 0) {
            n1 = -(n1);
        }

        if (n2 < 0) {
            n2 = -(n2);
        }

        //swap
        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        System.out.println(" ");
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);


        System.out.println("\n*************Step D******************************");
        // Print all the numbers divisible by 5 and their sum
        int num = n1;
        int sum = 0;

        System.out.print("Numbers divisible by 5 between 4 and 25: ");
        while (num <= n2) {
            if (num % 5 == 0) {
                System.out.print(num + " ");
                sum = sum + num;
            }
            num++;
        }
        System.out.println();
        System.out.println("Sum of the numbers divisible by 5  between 4 and 25:  " + sum);

        // Print all the odd numbers
        System.out.println("\n*************Step E******************************");
        int num2 = n2;
        double average = 0;
        int count = 0;

        System.out.print("Odd numbers between 25 and 4: ");
        while (num2 >= n1) {
            if (!(num2 % 2 == 0)) {
                System.out.print(num2 + " ");
                average = average + num2;
                count++;
            }
            num2--;
        }
        System.out.println();
        System.out.println("Average of the odd numbers between 25 and 4: " + (average / count));

        // Print all the numbers and their square between 2 and 16
        System.out.println("\n*************Step F******************************");
        int number = 2;

        System.out.print("Table of each even integer and its square between 2 and 16: ");
        while (number <= 16) {

            System.out.println();
            System.out.println(number + "  " + (number * number));

            number = number + 2;
        }
        System.out.println();

        //Uppercase letters
        System.out.println("*************Step G******************************");
        char ch = 'A';
        System.out.println("Uppercase letters: ");
        while (ch <= 'Z') {
            System.out.print(ch + " ");
            ch++;
        }


    }
}
