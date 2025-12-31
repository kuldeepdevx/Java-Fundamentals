package Fundamentals.Basics;
import java.util.Scanner;

public class uerinput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter roll no:");
        int x=sc.nextInt();
        System.out.print("Enter student name:");
        String myName=sc.next();

        System.out.println("Roll no:"+x+" Name is: "+myName);
    }
}
