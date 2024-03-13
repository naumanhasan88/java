/*a programming problem that involves using all three logical operators (and, or, and not):

Problem: User Authentication

You are tasked with implementing a simple user authentication system. 
The system should check if a user is eligible to access a secure area based on the following conditions:

    The user must be at least 18 years old.
    The user should have a valid account (represented by the variable has_account).
    The user must not be a guest (represented by the variable is_guest).

Write a program that takes user input for age, account status, and guest status,
and outputs whether the user is eligible to access the secure area.

Remember to use logical operators (and, or, not) to combine these conditions in an if statement. Good luck! */
package questions.conditionals;

import java.util.Scanner;

public class UserAuth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        scan.nextLine();// Consume the newline character

        System.out.println("Do you have account access? (yes or no): ");
        String has_account = scan.nextLine();

        System.out.println("Are you a guest? (yes or no): ");
        String is_guest = scan.nextLine();

        // Use logical operators to check conditions
        if (age >= 18 && has_account.equals("yes") && !is_guest.equals("yes")) {
            System.out.println("You are good for private access.");
        } else {
            System.out.println("No access.");
        }

        // Close the scanner to avoid resource leaks
        scan.close();
    }
}

