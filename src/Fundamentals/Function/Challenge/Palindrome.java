package Fundamentals.Function.Challenge;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a num:");
        int num=input.nextInt();

        boolean isPalindrome=isPalindrome(num);
        if(isPalindrome) {
            System.out.println(num + " is a palindrome num");
        } else {
            System.out.println(num + " is not a palindrome num");
        }
    }
    public static boolean isPalindrome(int num){
        int realnum=num;
        int reverse=0;
        while(num!=0){
            reverse=reverse*10+num%10;
            num/=10;
        }
        if(reverse==realnum){
            return true;
        } else{
           return false;
        }
    }
}
