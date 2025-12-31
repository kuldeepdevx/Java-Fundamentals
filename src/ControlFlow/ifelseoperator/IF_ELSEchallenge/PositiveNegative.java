package ControlFlow.ifelseoperator.IF_ELSEchallenge;
import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome! to number checker");
        System.out.print("Enter a num:");
        int num=sc.nextInt();

        if(num>=0){
            if(num==0){
                System.out.println("Input Num is zero");
            }else{
                System.out.println("Input Num is Positive");
            }
        }else{
            System.out.print("Input Num is Negative");
        }
    }
}
