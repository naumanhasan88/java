package questions.conditionals;
import java.util.Scanner;

class NumberCheck {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.println("Enter a number: ");
        number = scan.nextInt();
        checkNumber(number);
        scan.close();
    }

    static void checkNumber(int num){
        if(num == 0){
            System.out.println("Your number is zero");
        }
        else if(num > 0){
            System.out.println("Your number is positive");
        }
        else{
            System.out.println("Your number is negative");
        }
    }
}
