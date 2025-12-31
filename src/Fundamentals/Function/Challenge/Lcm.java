package Fundamentals.Function.Challenge;
import java.util.Scanner;

public class Lcm {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first num:");
        int first=input.nextInt();
        System.out.print("Enter second num:");
        int second=input.nextInt();

        int lcm=numLcm(first,second);
        System.out.println("Lcm of "+first+" and "+second+" is "+lcm);
    }
    public static int numLcm(int first,int second){
        int i=1;
        while(true){
            if((first*i)%second==0){
                int lcm=first*i;
            }
            i++;
        }
    }

}
