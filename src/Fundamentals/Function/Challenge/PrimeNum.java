package Fundamentals.Function.Challenge;
import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a num:");
        int num=input.nextInt();
        boolean isPrime=isPrime(num);
        if(isPrime) {
            System.out.println(num + " is a prime num");
        }else {
            System.out.println(num+" is not a prime num");
        }
    }
    public static boolean isPrime(int num){
        int i=2;
        while(i<num){
            if(num%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}