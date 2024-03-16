package questions.number_basic;

import java.util.*;
public class OddEven {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        scanner.close();
        CheckPrime(number);
    }
    static void CheckPrime(int n){
        if(n%2==0){ 
            System.out.println(n + " Its is prime");
        }
        else{
            System.out.println(n + " is not prime");
        }
    }
}
