package questions.loops;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number <= 1) {
            System.out.println(number + " is not prime.");
        } else {
            boolean isPrime = true; // Assume the number is prime initially

            for (int i = 2; i <=number/2; i++) {
                if (number % i == 0) {
                    isPrime = false; // If the number is divisible by any other number, it's not prime
                    break; // No need to check further, exit the loop
                }
            }
            if (isPrime) {
                System.out.println(number + " is prime.");
            } else {
                System.out.println(number + " is not prime.");
            }
        }
    }
}

