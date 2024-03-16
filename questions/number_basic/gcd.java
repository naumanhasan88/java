package questions.number_basic;

import java.util.*;

public class gcd{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int number3 = scanner.nextInt();
        scanner.close();
        int gcd = 1; // Initialize GCD to 1
        // Finding factors of the all the number's
        for (int i = 1; i <= number1 && i <= number2 && i<= number3; i++) {
            if (number1 % i == 0 && number2 % i == 0 && number3%i==0) {
                gcd = i; // Update GCD if 'i' is a common factor
            }
        }
        // Printing the GCD
        System.out.println("GCD of " + number1 + " and " + number2 + " is: " + gcd);
    }
}
