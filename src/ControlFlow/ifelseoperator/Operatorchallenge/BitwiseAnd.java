package ControlFlow.ifelseoperator.Operatorchallenge;
import java.util.Scanner;

public class BitwiseAnd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to operator program");
        System.out.print("Enter first num:");
        int first=sc.nextInt();
        System.out.print("Enter second num:");
        int second=sc.nextInt();

        int BitwiseAnd=first&second;
        System.out.print("Bitwise And of both num is "+BitwiseAnd);

    }
}
