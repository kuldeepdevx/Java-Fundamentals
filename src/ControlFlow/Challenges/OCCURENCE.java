package ControlFlow.Challenges;

import java.util.Scanner;

public class OCCURENCE {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter array size:");
        int size=input.nextInt();
        int[] user=new int[size];
        input(user,input);
        System.out.print("Enter a num to check Occurence:");
        int target=input.nextInt();
        Occurence(user,target);
    }
    static void input(int[] user,Scanner input) {
        for (int i = 0; i < user.length; i++) {
            System.out.print("Enter " + (i + 1) + " element:");
            user[i] = input.nextInt();
        }
    }
        static void Occurence(int[] user,int target) {
       int count=0;
            for (int n : user) {
                if(n==target) count++;
            }
            System.out.print("Occurence of "+target+" is "+count);
        }
}
