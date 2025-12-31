package ControlFlow.ifelseoperator;
import java.util.Scanner;

public class perimeter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter A side of rectangle:");
        int a=sc.nextInt();
        System.out.print("Enter B side of rectangle:");
        int b=sc.nextInt();
        System.out.print("Enter C side of rectangle:");
        int c=sc.nextInt();
        System.out.print("Enter D side of rectangle:");
        int d=sc.nextInt();

        int perimeter=a+b+c+d;

        System.out.print("Perimeter of rectangle is:"+perimeter);
    }
}
