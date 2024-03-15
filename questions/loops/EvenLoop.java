package questions.loops; // Package declaration

import java.util.Scanner; // Import Scanner class for user input

public class EvenLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for user input

        // Prompt user to enter two numbers
        System.out.println("Enter two numbers. The first number must be greater than the second number.");

        // Get the first number from the user
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        // Get the second number from the user
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Check if the first number is greater than the second number
        if (number1 <= number2) {
            System.out.println("Please enter the numbers again with the first number greater than the second number.");
        } else {
            // If the first number is greater, print even numbers between the two numbers
            System.out.println("Even numbers between " + number2 + " and " + number1 + ":");

            // Loop through numbers between number2 and number1
            for (int index = number2; index <= number1; index++) {
                // Check if the current number is even
                if (index % 2 == 0) {
                    // If even, print the number
                    System.out.print(index + " ");
                }
            }
            System.out.println(); // Print a new line after the loop for better formatting
        }

        scanner.close(); // Close Scanner object to release resources
    }
}
