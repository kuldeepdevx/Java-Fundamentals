package ControlFlow.ifelseoperator;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first num:");
        int first=sc.nextInt();

        System.out.print("Enter seond num to swap:");
        int second=sc.nextInt();

        first=first+second;
        second=first-second;
        first=first-second;

        System.out.print("("+first+","+second+")");
    }
}