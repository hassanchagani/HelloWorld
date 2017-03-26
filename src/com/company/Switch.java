package com.company;

import java.util.Scanner;

/**
 * Created by hassanchagani on 3/26/17.
 */
public class Switch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a command: ");
        String text = input.nextLine();

        switch (text) {
            case "start":
                System.out.println("Machine started!");
                break;

            case "stop":
                System.out.println("Machine stopped!");
                break;

            default:
                System.out.println("Command not recognized");
        }

    }

}
