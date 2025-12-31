package ControlFlow.ifelseoperator;
import java.util.Scanner;

public class Operator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter A num:");
        int a=sc.nextInt();
        System.out.print("Enter B num:");
        int b=sc.nextInt();

        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a-b);
        System.out.println(a%b);
    }
}
