package ControlFlow.Challenges;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a num:");
        int num=input.nextInt();
        boolean isPrime=isPrime(num);
        if(isPrime) System.out.println(num+" is prime");
        else System.out.println(num+" is not prime");
    }
    static boolean isPrime(int num){
        if(num==2) return true;
        int i=2;
//        while(i<num){
//            if(num%i==0) return false;
//            i++;
//        }
        do{
            if(num%i==0) return false;
            i++;
        }while(i<num);
        return true;
    }
}
