package questions.conditionals;
/*Certainly! Here's a question for you to practice using the ternary operator in Java:

**Question:**
Write a Java program that takes an integer variable `score` and assigns the corresponding grade based on the following conditions:
- If `score` is greater than or equal to 90, assign the grade "A".
- If `score` is between 70 (inclusive) and 89 (inclusive), assign the grade "B".
- If `score` is between 50 (inclusive) and 69 (inclusive), assign the grade "C".
- If `score` is below 50, assign the grade "F".

Use the ternary operator to accomplish this and print the assigned grade.

Feel free to give it a try, and I'll provide assistance if needed! */
import java.util.Scanner;
public class score {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score : ");
        int score = scan.nextInt();
        String Grade = (score >= 90)? "A": (score>=70 && score<=89)? "B" : (score>=50 && score<=69)? "C" : "F" ;
        System.out.println("Your grade is : " + Grade);
        scan.close();
    }
}
