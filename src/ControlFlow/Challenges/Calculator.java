package ControlFlow.Challenges;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter first num:");
        int firstOperand=input.nextInt();
        System.out.print("Enter Second num:");
        int secondOperand=input.nextInt();
        System.out.print("Enter opertaor(+,-,*,/):");
        char operator=input.next().charAt(0);
        double ans=switch(operator){
            case '+' ->firstOperand+secondOperand;
            case '-' ->firstOperand-secondOperand;
            case '*' ->firstOperand*secondOperand;
            case '/' ->(double)firstOperand /secondOperand;
            default ->0;
        };
        System.out.print(firstOperand+" "+operator+" "+secondOperand+" is "+ans);
    }
}
