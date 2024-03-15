package questions.loops;
import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number here :");
        int n = scanner.nextInt();
        scanner.close();
        
        int number = 1;
        int fact = 1;
        while (number <= n) {
            fact = fact  *  number;
            number++;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
