package ControlFlow.Loops;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String pass="Kuldeep";
        String password="";
        for(;!password.equals(pass);){
            System.out.print("Enter password:");
            password=input.next();
        }
        System.out.println("Password was right:");
    }
}
