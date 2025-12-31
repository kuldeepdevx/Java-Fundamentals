package ControlFlow.ifelseoperator.Operatorchallenge;
import java.util.Scanner;

public class BitwiseLeftshift {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a num:");
        int num=input.nextInt();

        System.out.print("How much to do left shift:");
        int shift=input.nextInt();

        int LeftShift=num<<shift;
        System.out.print(num+"<<"+shift+" is "+LeftShift);
    }
}
