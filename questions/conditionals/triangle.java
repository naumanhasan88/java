package questions.conditionals;
// Importing the Scanner class from java.util package for user input
import java.util.Scanner;

// Defining the triangle class
public class triangle {
    
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scan = new Scanner(System.in);
        
        // Prompting the user to enter the first side of the triangle
        System.out.println("Enter the first side: ");
        double side1 = scan.nextDouble();
        
        // Prompting the user to enter the second side of the triangle
        System.out.println("Enter the second side: ");
        double side2 = scan.nextDouble();
        
        // Prompting the user to enter the third side of the triangle
        System.out.println("Enter the third side: ");
        double side3 = scan.nextDouble();
        
        // Checking if the triangle is equilateral
        if (side1 == side2 && side1 == side3) {
            System.out.println("Your triangle is equilateral");
        }
        // Checking if the triangle is isosceles
        else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("This is an isosceles triangle");
        }
        // If the triangle is not equilateral or isosceles, it is scalene
        else {
            System.out.println("This is a scalene triangle");
        }
        scan.close();
    }
}
