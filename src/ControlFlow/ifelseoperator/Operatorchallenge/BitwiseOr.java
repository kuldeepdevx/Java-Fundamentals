package ControlFlow.ifelseoperator.Operatorchallenge;
import java.util.Scanner;

public class BitwiseOr {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter first num:");
        int first=input.nextInt();
        System.out.print("Enter second num:");
        int second=input.nextInt();

        int BitwiseOr=first|second;
        System.out.print("Bitwise Or of both num is "+BitwiseOr);
    }
}
