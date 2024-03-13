package questions.conditionals;
import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user to enter the day
        System.out.println("Enter the day: ");

        // Read user input and convert to lowercase for case-insensitivity
        String day = scan.nextLine();
        String dayLower = day.toLowerCase();

        // Use a switch statement to handle different days of the week
        switch (dayLower) {
            case "sunday":
                // Display a message for Sunday
                System.out.println("Enjoy that day!");
                break;
            case "monday":
                // Display a message for Monday
                System.out.println("It's work time!");
                break;
            case "tuesday":
                // Display a message for Tuesday
                System.out.println("Another day, another task!");
                break;
            case "wednesday":
                // Display a message for Wednesday
                System.out.println("Halfway through the week!");
                break;
            case "thursday":
                // Display a message for Thursday
                System.out.println("Just one more day!");
                break;
            case "friday":
                // Display a message for Friday
                System.out.println("It's Friday, take a break!");
                break;
            case "saturday":
                // Display a message for Saturday
                System.out.println("Enjoy your Saturday!");
                break;
            default:
                // Display a message for invalid input
                System.out.println("Please enter a valid day.");
        }

        // Close the scanner
        scan.close();
    }
}
