package questions.loops;

import java.util.Scanner;

public class MultiplicatioNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number here : ");
        int number = scanner.nextInt();
        scanner.close();
        
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= 10; j++) {
                int product = i * j;
                System.out.println(i + " x " + j + " = " + product);
            }
            System.out.println();// Add an empty line after each table
        }
    }
}

