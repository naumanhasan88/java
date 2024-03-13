package questions.conditionals;

import java.util.Scanner;

public class EligibilityCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter your age:");
        int age = scan.nextInt();
        
        checkAge(age);
        scan.close();
    }

    static void checkAge(int age) {
        if (age > 18) {
            System.out.println("You are verified to vote");
        } else {
            System.out.println("You are not verified to vote");
        }
    }
}

