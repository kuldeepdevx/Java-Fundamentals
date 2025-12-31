package Fundamentals.Function.Challenge;
import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a num:");
        int num=input.nextInt();
        long factorial=fact(num);
        System.out.println("Factorial of "+num+" is "+factorial);
    }
    public static long fact(int num){
        int i=1;
        long fact=1;
        while(i<=num){
            fact*=i;
            i++;
        }
        return fact;
    }
}