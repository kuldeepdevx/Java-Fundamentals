package Fundamentals.Basics;
import java.util.Scanner;

public class inputchallenge {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your name:");
        String myName=sc.nextLine();

        System.out.print("Please also tell your age:");
        int myAge=sc.nextInt();

        System.out.println(myName+"! Welcome to java coding");

        System.out.println("Lets! do a simple calculation");

        System.out.print("Enter a num:");
        int firstNum=sc.nextInt();

        System.out.print("Enter another num to add:");
        int secondNum=sc.nextInt();

        System.out.print("Addition of two num is "+(firstNum+secondNum));
    }
}
