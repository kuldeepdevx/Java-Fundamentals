package Fundamentals.Function.Challenge;
import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a num:");
        int num=input.nextInt();

        int sum=sumDigits(num);
        System.out.print("Sum of digits of "+num+" is "+sum);
    }
    public static int sumDigits(int num){
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}
