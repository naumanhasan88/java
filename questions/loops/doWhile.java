package questions.loops;

import java.util.*;

public class doWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int secretNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. Can you guess it?");

        // Repeat the guessing process until the correct number is guessed
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            // Provide feedback based on the user's guess
            if (guess > secretNumber) {
                System.out.println("Too high.");
            } else if (guess < secretNumber) {
                System.out.println("Too low.");
            } else {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            }
        } while (guess != secretNumber);
        scanner.close();
    }
}
