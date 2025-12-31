package ControlFlow.Challenges;

import java.util.Scanner;

public class absoluteNum {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a num:");
        int inputNum=input.nextInt();

        ternaryOperator(inputNum);
        switchStatement(inputNum);
    }
    public static void ternaryOperator(int inputNum){
        int ans=inputNum>=0?inputNum:inputNum*-1;
        System.out.println("Absolute value of "+inputNum+" is "+ans);
    }
    public static void switchStatement(int inputNum){
       int sign=inputNum>=0?1:-1;
        int ans=switch(sign){
            case 1 ->inputNum;
            case -1 ->inputNum*-1;
            default ->0;
        };
        System.out.println("Absolute value of "+inputNum+" is "+ans);
    }
}
