package ControlFlow.Loops;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter first num:");
        int first=input.nextInt();
        System.out.print("Enter second num:");
        int second=input.nextInt();
        String ans=(first>second)?"First":"Second";
        System.out.print(ans);
    }
}
