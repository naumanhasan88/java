package questions.loops;
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for the pattern: ");
        int number = scanner.nextInt();
        scanner.close();
        
        for (int i = 1; i <= number; i++) {
            // Create an empty string to store the pattern for each row
            String symbols = "";
            
            // Concatenate '*' to the string 'i' times
            for (int j = 1; j <= i; j++) {
                symbols += "*";
            }
            
            // Print the pattern for the current row
            System.out.println(symbols);
        }
    }
}
