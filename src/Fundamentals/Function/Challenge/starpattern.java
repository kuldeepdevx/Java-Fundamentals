package Fundamentals.Function.Challenge;
import java.util.Scanner;

public class starpattern {
    public static void main(String[] arsg){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your choices:\n 1>star pattern\n2>reverse star pattern\n3>space star pattern\nchoice:");
        int choice=input.nextInt();

        if(choice==1){
            starPattern();
        }
        if(choice==2){
            reversePattern();
        }
        if(choice==3){
            spacePattern();
        }
    }
    public static void starPattern(){
        int i=0;
        while(i<5){
            int j=0;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void reversePattern(){
        int i=0;
        while(i<5){
            int j=0;
            while(j<5-i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void spacePattern(){
        int i=0;
        while(i<5){
            int k=5-i-1;
            while(k>0){
                System.out.print(" ");
                k--;
            }
            int j=0;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
