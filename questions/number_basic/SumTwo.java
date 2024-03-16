package questions.number_basic;

import java.util.Scanner;
public class SumTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers here : ");
        System.out.println("First number : ");
        int number1 = scanner.nextInt();
        System.out.println("Second number : ");
        int number2 = scanner.nextInt();
        scanner.close();
        int sum = (number1+number2);
        System.out.println("Your sum is : " + sum);
    }
}