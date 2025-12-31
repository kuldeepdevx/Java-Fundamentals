package ControlFlow.ifelseoperator;
import java.util.Scanner;

public class product {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("WELCOME TO NUMBER MULTIPLICATION!");
        System.out.print("Enter first num:");
        float first=sc.nextFloat();
        System.out.print("Enter second num:");
        float second=sc.nextFloat();

        float ans=first*second;
        System.out.print("Ans is:"+ans);

    }
}
