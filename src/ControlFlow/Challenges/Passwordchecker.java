package ControlFlow.Challenges;

import java.util.Scanner;

public class Passwordchecker {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to password checker:");
        String password="Kuldeep18";
        String userPassword;
        int i=3;
        do{
            System.out.print("Enter password:");
            userPassword = input.next();
            if(i==1 && !userPassword.equals(password)){
                System.out.println("your account is blocked");
                break;
            }
            if (!userPassword.equals(password)){
                i--;
                System.out.println("Password is wrong you have only "+i+" chance");
            }
        }while(!userPassword.equals(password));
        if(userPassword.equals(password)) System.out.println("Password is right");
        String press;
        input.nextLine();
        do{
            System.out.print("Press enter for Entering Guess game:");
            press=input.nextLine();
        }while(!press.equals(" "));
        guessgame(input);
    }
    static void guessgame(Scanner input){
        System.out.println("Welcome to Guess number game");
        int num=9;
        int userNum;
        do{
            System.out.print("Guess a num to out of loop:");
            userNum=input.nextInt();
        }while(userNum!=num);
        System.out.print("You are out of loop");
    }
}
