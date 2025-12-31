package ControlFlow.ifelseoperator.IF_ELSEchallenge;
import java.util.Scanner;

public class Greatest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first num:");
        int first=sc.nextInt();

        System.out.print("ENter  second num:");
        int second=sc.nextInt();

        System.out.print("Enter third num:");
        int third=sc.nextInt();

        if(first>second) {
            if (first>third) {
                if (second>third) {
                    System.out.print(first + " " + second + " " + third);
                } else {
                    System.out.print(first + " " + third + " " + second);
                }
            }else{
                System.out.print(third+" "+first+" "+second);
            }
        }else if(second>third) {
            if(first>third){
                System.out.print(second+" "+first+" "+third);
            }else{
                System.out.print(second+" "+third+" "+first);
            }
        }else if(first>second){
            System.out.print(third+" "+first+" "+second);
        }else{
            System.out.print(third+" "+second+" "+first);
        }
    }
}
