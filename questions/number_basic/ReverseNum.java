package questions.number_basic;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("ENTER THE NUMBER HERE : ");
        int number = scanner.nextInt(); // Read the input number
        
        // Initialize variables for storing the reversed number and the digit
        int reverseNum = 0;
        int digit;
        
        // Close the scanner since we have finished reading input
        scanner.close();
        
        // Loop through each digit of the input number and reverse it
        for (int i = number; i != 0; i /= 10) {
            digit = i % 10; // Get the last digit of the current number
            reverseNum = reverseNum * 10 + digit; // Append the digit to the reversed number
        }
        
        // Print the reversed number
        System.out.println("Reversed number: " + reverseNum);
    }
}
