package questions.number_basic;

import java.util.*;

public class PrimeNum {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Asking the user to enter a number
        System.out.println("Enter the number : ");
        
        // Reading the number entered by the user
        int number = scanner.nextInt();
        int i; // Declaring a variable to use in the loop
        
        // Closing the scanner to release system resources
        scanner.close();
        
        // Assuming the number is prime initially
        boolean isPrime = true;
        
        // Loop to check if the number is divisible by any integer from 2 to half of the number
        for (i = 2; i <= number / 2; i++) {
            // Checking if the number is divisible evenly by the current value of i
            if (number % i == 0) {
                // If the number is divisible, it's not prime
                isPrime = false;
                // Exiting the loop since we found that the number is not prime
                break;
            }
        }
        
        // Checking if isPrime is still true after the loop
        if (isPrime) {
            // If isPrime is true, the number is prime
            System.out.println("Your number is prime");
        } else {
            // If isPrime is false, the number is not prime
            System.out.println("Not prime number");
        }
    }
}