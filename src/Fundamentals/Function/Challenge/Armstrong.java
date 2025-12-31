package Fundamentals.Function.Challenge;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a num:");
        int num=input.nextInt();

        boolean isArmstrong=isArmstrong(num);
        if(isArmstrong){
            System.out.print(num+" is Armstrong num");
        }else{
            System.out.print(num+" is not a Armstrong num");
        }
    }
    public static boolean isArmstrong(int num){
        int count=count(num);
        int isArmstrong=0;
        int x;
        int real=num;
        while(num!=0){
            x=cube(num%10,count);
            isArmstrong+=x;
            num/=10;
        }
        if(isArmstrong==real){
            return true;
        }else return false;
    }
    public static int cube(int num,int count){
        int pow=1;
        while(count!=0){
            pow*=num;
            count--;
        }
        return pow;
    }
    public static int count(int num){
        int count=0;
        while(num!=0){
            num/=10;
            count++;
        }
        return count;
    }
}
