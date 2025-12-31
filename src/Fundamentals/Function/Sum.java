package Fundamentals.Function;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        int first=readNumber();
        int second=readNumber();
        int result=Add(first,second);
        System.out.print("Addition of both num is:"+result);
    }
    public static int readNumber(){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a num:");
        return input.nextInt();
    }
    public static int Add(int first,int second){
        return first+second;
    }
}
