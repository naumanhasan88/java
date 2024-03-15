package questions.loops;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number here : ");
        int number = scanner.nextInt();
        scanner.close();
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer greater than zero.");
            return;
        }
        if (number == 1) {
            System.out.println("0");
            return;
        }
        int f0 = 0, f1 = 1;
        System.out.print("0 "); // Print the first Fibonacci number
        for (int i = 2; i <= number; i++) {
            int fn = f0 + f1;
            System.out.print(fn + " ");
            f0 = f1;
            f1 = fn;
        }
    }
}