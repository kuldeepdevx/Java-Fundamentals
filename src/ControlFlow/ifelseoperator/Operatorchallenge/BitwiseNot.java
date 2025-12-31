package ControlFlow.ifelseoperator.Operatorchallenge;
import java.util.Scanner;

public class BitwiseNot {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a num:");
        int first=input.nextInt();

        int BitwiseNot=~first;
        System.out.print("Bitwise not of num is "+BitwiseNot);
    }
}
