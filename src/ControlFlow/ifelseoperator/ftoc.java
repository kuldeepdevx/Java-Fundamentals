package ControlFlow.ifelseoperator;
import java.util.Scanner;

public class ftoc {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Fahrenhit Temperature:");
    float fahrenhit=sc.nextFloat();

    float celsius=(fahrenhit-32)*5.0f/9;

    System.out.print(fahrenhit+"F in C is "+celsius+"C");
   }
}
