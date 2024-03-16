package questions.number_basic;

import java.util.Scanner;

public class PerfectNum {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        int i, fact, sum = 0;
        scanner.close();
        for (i = 1; i <= (number / 2); i++) {
            if (number % i == 0) {
                fact = i;
                System.out.println(fact);
                sum += fact;
            }
        }
        System.out.println("Sum of factors: " + sum);
        if(sum==number){
            System.out.println("It is a perfect number.");
        }
        else{
            System.out.println("It is not a perfect number.");
        }
    }
}
