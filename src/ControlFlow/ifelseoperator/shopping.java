package ControlFlow.ifelseoperator;
import java.util.Scanner;

public class shopping {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("*********************\nWelcome! to our Website\n*********************");
        System.out.print("Please, Enter your name:");
        String name=sc.nextLine();

        System.out.print("Do you (Male/Female):");
        String gender=sc.nextLine();

        System.out.print("Tell me your age?:");
        int age=sc.nextInt();
        sc.nextLine();

        if(gender.equals("female")|| (age<=5 || age>=75)){
            if (gender.equals("female")) {
                System.out.println("Congratulation You got a 75% discount on Kurtis");
            }else{
                System.out.print("Congratulations You got a 75% discount on Clothes");
            }
        }else {
            System.out.println("You are not eligible for any discount");
        }
        System.out.print("Is you want to contine to Shopping(Y/N):");
        String Continue=sc.next();
        if(Continue.equalsIgnoreCase("Y")){
            if(gender.equals("female")){
                System.out.println("We have only 2 kurtis left:");
                System.out.println("1.WHITE 2.BLACK");
                System.out.print("Tell me whch one do you want\nPress:1 for WHITE\nPress:2 for Black:\nChoices:");
                int choices=sc.nextInt();
                sc.nextLine();
                System.out.print("Enter your size (28/30/32/34):");
                int size=sc.nextInt();
                sc.nextLine();
                if(size<=32){
                    System.out.println("Your cart value is 799/");
                }else{
                    System.out.println("Your cart value is 999/");
                }
                System.out.print("Payment method:UPI or COD:");
                String payment=sc.nextLine();
                if(payment.equalsIgnoreCase("UPI")){
                    System.out.println("Please pay to this UPI ID-xxxxxxxxxx@YBL");
                    String paid;
                   do {
                       System.out.print("IS Paid(Y/N):");
                       paid=sc.next();
                   }while(paid.equalsIgnoreCase("Y"));
                   System.out.println("Your order will be deliver to you by 3-4 Working days");
                   System.out.print("Thanks! for shopping in our website");
                }else{
                    System.out.println("OK you can pay during delivery time in cash or online");
                    System.out.println("Your order will be deliver to you by 3-4 Working days");
                    System.out.print("Thanks! for shopping in our website");
                }
            }
        }else{
            System.out.print("***************************\nThanks to check our website come again\n***************************");
        }
    }
}
