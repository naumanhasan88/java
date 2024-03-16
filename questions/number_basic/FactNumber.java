package questions.number_basic;

import java.util.*;
public class FactNumber {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        int number,i,fact =1;
        System.out.println("Enter the number : ");
        number = scanner.nextInt();
        scanner.close();
        for(i = 1; i<= number; i++){
            fact = fact * i;
        }
        System.out.println("Your factorial is  : " +  fact);
    }
}
