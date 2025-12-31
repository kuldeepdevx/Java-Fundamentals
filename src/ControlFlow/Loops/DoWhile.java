package ControlFlow.Loops;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String pass="Kuldeep";
        String password;
        do{
            System.out.print("Enter password:");
            password=input.next();
            if(!password.equals(pass)) System.out.println("Password is wrong,Please re-enter");
        }while(!password.equals(pass));
    }
}
