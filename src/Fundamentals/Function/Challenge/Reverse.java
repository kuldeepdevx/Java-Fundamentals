package Fundamentals.Function.Challenge;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a num:");
        int num=input.nextInt();

        int reverse=doReverse(num);
        System.out.print("reverse num is "+reverse);
    }
    public static int doReverse(int num){
        int reverse=0;
        while(num!=0){
            reverse=reverse*10+(num%10);
            num/=10;
        }
        return reverse;
    }
}
