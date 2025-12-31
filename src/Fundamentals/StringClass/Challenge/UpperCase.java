package Fundamentals.StringClass.Challenge;
import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter first word:");
        String first=input.next();

        System.out.print("Enter seecond word:");
        String second=input.next();

        System.out.print(first.concat(" ").concat(second).toUpperCase());

        System.out.println();
    }
}
