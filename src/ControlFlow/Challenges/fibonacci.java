package ControlFlow.Challenges;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter nth term to print fibonacci series:");
        int n=input.nextInt();
        int i=1;
        while(i<=n) {
            System.out.print(fibonacciPrint(i)+" ");
            i++;
        }
    }
    static int fibonacciPrint(int position){
        if(position == 1) {
            return 0;
        }
        if(position == 2){
            return 1;
        }
        return fibonacciPrint(position-1)
                + fibonacciPrint(position-2);
    }
}
