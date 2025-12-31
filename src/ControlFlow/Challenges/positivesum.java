package ControlFlow.Challenges;

import java.util.Scanner;

public class positivesum {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        sumofPositive(input);
    }
    static void sumofPositive(Scanner input){
        int n,sum=0;
        do{
            System.out.print("Enter a num:");
            n=input.nextInt();
            if(n>0) sum+=n;
        }while(n!=0);
        System.out.print("Snm of all enter positive num is :"+sum);
    }
}
