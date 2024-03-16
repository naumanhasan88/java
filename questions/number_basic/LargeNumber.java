package questions.number_basic;
/* Design a program with if-else statements to identify 
and display the largest among three given numbers.*/
import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);

        // Declare variables to store three numbers
        int number_1, number_2, number_3;

        // Prompt the user to enter the first number
        System.out.println("Enter the first number: ");
        number_1 = scan.nextInt();

        // Prompt the user to enter the second number
        System.out.println("Enter the second number: ");
        number_2 = scan.nextInt();

        // Prompt the user to enter the third number
        System.out.println("Enter the third number: ");
        number_3 = scan.nextInt();

        // Use if-else statements to identify and display the largest among the three numbers
        if (number_1 > number_2 && number_1 > number_3) {
            System.out.println("Your first number is the largest among the three.");
        } else if (number_2 > number_1 && number_2 > number_3) {
            System.out.println("Your second number is the largest among the three.");
        } else {
            System.out.println("Your third number is the largest among the three.");
        }
        // Close the Scanner to avoid resource leak
        scan.close();
    }
}
