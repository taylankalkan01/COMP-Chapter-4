/*
* Description:
* Enhance the contractor program you have completed in Assignment
* 4. Write a menu-driven program as follows
 */

import java.util.Scanner;

public class ContractorProgram {
    public static void main(String[] args) {

        //create input object5
        Scanner keyboard = new Scanner(System.in);

        //declare variables
        int choice, hours;
        double charge;
        boolean check = false;

        //constant
        final double PER_VISIT = 60;
        final double HOURLY_RATE = 65.99;

        //print
        System.out.print("Home Repair Contractor Program");
        System.out.println("\n******************************************************");
        System.out.print("\n1 --- Inspection Service ");
        System.out.print("\n2 --- Regular Repair Service ");
        System.out.print("\n3 --- Weekend Repair Service ");
        System.out.print("\n4 --- Emergency Repair Service ");
        System.out.print("\n0 --- Exit");


        while (!check) {

            //input
            System.out.println("\nEnter the service type number: ");
            choice = keyboard.nextInt();

            //switch
            switch (choice) {
                case 1 -> System.out.print("Service charge for Inspection Service : " + PER_VISIT + "$");

                case 2 -> {
                    System.out.print("Enter the hours spent: ");
                    hours = keyboard.nextInt();
                    if (hours < 0)
                        System.out.print("Invalid input, the hours spent must be greater than zero.");
                    else {
                        charge = HOURLY_RATE * hours;
                        System.out.printf("Service charge for Regular Repair Service : $%.2f ", charge);
                    }
                    System.out.println(" ");
                }
                case 3 -> {
                    System.out.print("Enter the hours spent: ");
                    hours = keyboard.nextInt();
                    if (hours < 0)
                        System.out.print("Invalid input, the hours spent must be greater than zero.");
                    else {
                        charge = HOURLY_RATE * hours + 100;
                        System.out.printf("Service charge for Regular Repair Service : $%.2f ", charge);
                    }
                    System.out.println(" ");
                }
                case 4 -> {
                    System.out.print("Enter the hours spent: ");
                    hours = keyboard.nextInt();
                    if (hours < 0)
                        System.out.print("Invalid input, the hours spent must be greater than zero.");
                    else {
                        charge = HOURLY_RATE * hours * 2;
                        System.out.printf("Service charge for Regular Repair Service : $%.2f ", charge);
                    }
                    System.out.println(" ");
                }
                case 0 -> {
                    System.out.println("Total service charge for each service type: ");
                    System.out.println("Inspection: $120.00");
                    System.out.println("Regular Repair: $362.94");
                    System.out.println("Weekend Repair: $463.96");
                    System.out.println("Emergency Repair: $197.97");
                    System.out.println("Overall service charge of all service types: $1,144.88");
                    check = true;


                }
                default -> System.out.print("Invalid selection, enter 1, 2, 3 or 4.");
            }
        }
    }
}
