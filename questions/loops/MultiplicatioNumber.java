package questions.loops;

import java.util.Scanner;

public class MultiplicatioNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number here : ");
        int number = scanner.nextInt();
        System.out.println("Enter the number upto which you want the table : ");
        int number2 = scanner.nextInt();
        scanner.close();
        
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number2; j++) {
                int product = i * j;
                System.out.println(i + " x " + j + " = " + product);
            }
            System.out.println();// Add an empty line after each table
        }
    }
}

