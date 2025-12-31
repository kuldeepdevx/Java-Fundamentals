package Fundamentals.Function.Challenge;
import java.util.Scanner;

public class hcf {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter first num:");
        int first=input.nextInt();
        System.out.print("Enter second num:");
        int second=input.nextInt();

        int hcf=Hcf(first,second);
        System.out.println("Hcf of "+first+" and "+second+" is "+hcf);
    }
    public static int Hcf(int first,int second){
        int min=Min(first,second);
        int gcd=1;
        int i=2;
        while(i<=min){
            if((first%i==0) &&(second%i==0)){
                gcd=i;
            }
            i++;
        }
        return gcd;
    }
    public static int Min(int first ,int second) {
        if (first > second) return second;
        else return first;
    }
}
