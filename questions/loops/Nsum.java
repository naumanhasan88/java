package questions.loops;

import java.util.Scanner;

public class Nsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number here you want the sum up to : ");
        int user_input = scanner.nextInt();
        int i, sum = 0;
        scanner.close();
        for (i = 1; i <= user_input; i++) {
            sum += i;
        }
        System.out.println("The sum of the first " + user_input + " natural numbers is: " + sum);
    }
}
