package ControlFlow.ifelseoperator.Operatorchallenge;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a num:");
        int num=input.nextInt();

        if((num&1)==0){
            System.out.print(num+" is a even number");
        }else{
            System.out.println(num+" is odd num");
        }
    }
}
