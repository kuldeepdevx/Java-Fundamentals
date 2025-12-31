package ControlFlow.Challenges;

import java.util.Scanner;

public class inputBreak {
    inputBreak(String name){
        System.out.println("maked object");
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        inputBreak calling=new inputBreak("kuldeep");
        calling.takeInput(input);
        System.out.print("You are out of loop");
    }
    void takeInput(Scanner input){
        while(true){
            System.out.print("Enter anything or exit for break:");
            String name=input.nextLine();
            if(name.equalsIgnoreCase("exit")) break;
        }
    }
}
