package ControlFlow.ifelseoperator.Operatorchallenge;
import java.util.Scanner;

public class BitwiseRightShift {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a num:");
        int num=input.nextInt();

        System.out.print("How much to do Right shift:");
        int shift=input.nextInt();

        int RightShift=num>>shift;
        System.out.print(num+">>"+shift+" is "+RightShift);

    }
}
