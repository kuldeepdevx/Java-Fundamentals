package ControlFlow.ifelseoperator;
import java.util.Scanner;

public class compound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your Borrowed money:");
        double principal=sc.nextDouble();

        System.out.print("For how many years do you borrowed money:");
        double years=sc.nextDouble();

        System.out.print("Enter rate of interest:");
        double rate=sc.nextDouble();

        double compound=principal*Math.pow(1+rate/100.0,years);
        System.out.println("Compound interest is "+compound);
    }
}
