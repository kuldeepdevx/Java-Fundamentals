package ControlFlow.Loops;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a num for factorial:");
        int num=input.nextInt();
        long  fact=factorial(num);
        System.out.println("Factorial of "+num+" is "+fact);
    }
    public static long  factorial(int num){
        if(num==0) return 1;
        return num*factorial(num-1);
    }
    public static void input(int[] store,Scanner input){
        for(int i=0;i<store.length;i++){
            System.out.print("Enter "+(i+1)+"st element:");
            store[i]=input.nextInt();
        }
    }
}






//package ControlStatement.Code;
//
//public class forEachLoop {
//    public static void main(String[] args){
//        String[] names=new String[]{
//                "Ram","Sita","Geeta"
//        };
//        for(String name:names){
//            System.out.print(name+" ");
//        }
//    }
//}






