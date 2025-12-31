package Fundamentals.Function.Challenge;
import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a num:");
        int num=input.nextInt();
        Fibonnaci(num);
    }
    public static void Fibonnaci(int num){
        if(num<0) return;
        System.out.print("0 ");
        if(num==0) return;
        int nTerm=1;
        int first=0,second=1;
        while(nTerm<=num){
            System.out.print(nTerm +" ");
            nTerm=first+second;
            first=second;
            second=nTerm;
        }
    }
}
