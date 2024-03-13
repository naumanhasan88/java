package questions.conditionals;

import java.util.*;

public class LeapYear {
    public static void main(String [] args) {
        // Creating a Scanner object for user input
        Scanner scan = new Scanner(System.in);

        // Prompting the user to enter a year
        System.out.println("Enter the year : ");

        // Reading the user input as an integer
        int year = scan.nextInt();

        // Checking if the entered year is a leap year using the leap year rules
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            // Printing the result if the year is a leap year
            System.out.println(year + " is a leap year.");
        } 
        else {
            // Printing the result if the year is not a leap year
            System.out.println(year + " is not a leap year.");
        }
        scan.close();
    }
}
