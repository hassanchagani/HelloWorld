package com.company;

import java.util.Scanner;

/**
 * Created by hassanchagani on 3/25/17.
 */
public class Application {

    public static void main(String[] args) {
        //declare variable
        int myNumber;
        String hello = "Hello";
        String blank = " ";
        String name = "Hassan";
        String greeting = hello + blank + name;

        //assign variable
        myNumber = 25;
        //declare and initilize in one step
        int value = 0;

        //while loop
        /*
        while (true)
        {
            System.out.println("While Hello " + value);

            if (value == 5) {
                break;
            }

            value++;

            System.out.println("Running " + value);
        }
        */

        //for loop
        /*
        for (int i = 1; i < 6; i++) {
            System.out.println("For Hello " + i);
        }
        */

        //if
        /*
        if (myNumber < 10) {
            System.out.println("Yes, it's true");
        }
        else if (myNumber > 20) {
            System.out.println("No, it's false");
        }
        else {
            System.out.println("None of the above");
        }
        */

        // Getting user input
        // Create scanner object
        Scanner input = new Scanner(System.in);

        // Output the prompt
        System.out.println("Enter your name: ");

        // Wait for the user to enter a line of text
        String line = input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        // Tell them what they typed in
        System.out.println("You entered: " + line);
        System.out.println("You are " + age + " years old!");

        //System.out.println("Application: Hello World" + " " + myNumber);
        //sout = System.out.println();
        //System.out.println(myNumber);
        //System.out.println(greeting);
    }
}
