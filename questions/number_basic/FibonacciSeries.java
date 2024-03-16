package questions.number_basic;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci series: ");
        int numTerms = scanner.nextInt();
        scanner.close();
        if (numTerms <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        } else if (numTerms == 1) {
            System.out.println("Fibonacci series up to " + numTerms + " term:");
            System.out.println("0");
            return;
        } else if (numTerms == 2) {
            System.out.println("Fibonacci series up to " + numTerms + " terms:");
            System.out.println("0 1");
            return;
        }
        int f0 = 0, f1 = 1;
        // Print the first two terms
        System.out.println("Fibonacci series up to " + numTerms + " terms:");
        System.out.print("" + f0 + " " + f1);
        // Generate and print the remaining terms
        for (int i = 3; i <= numTerms; i++) {
            int next = f0 + f1;
            System.out.print(" " + next);
            f0 = f1;
            f1 = next;
        }
    }
}
