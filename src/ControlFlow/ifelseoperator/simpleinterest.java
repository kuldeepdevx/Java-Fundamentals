package ControlFlow.ifelseoperator;
import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Principal:");
        float p=sc.nextFloat();
        System.out.print("Enter Rate:");
        float r=sc.nextFloat();
        System.out.print("Enter Time:");
        float t=sc.nextFloat();
        float simpleInterest=(p*r*t)/100;

        System.out.println("Simple Interest is:"+simpleInterest);
            }
        }

