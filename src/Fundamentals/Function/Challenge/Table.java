package Fundamentals.Function.Challenge;
import java.util.Scanner;

public class Table {
    public static void main(String[] args){
        int input=readNumber();
        inputTable(input);
    }
    public static int readNumber(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a num to print table:");
        return input.nextInt();
    }
    public static void inputTable(int input){
        int i=1;
        while(i<=10){
            System.out.println(input+"X"+i+"="+input*i);
            i++;
        }
    }
}
