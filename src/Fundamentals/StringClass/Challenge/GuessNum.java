package Fundamentals.StringClass.Challenge;
import java.util.Scanner;

class GuessNum{
    int random;

    GuessNum(){
        random=(int)Math.ceil(Math.random()*100);
    }

    int numGuess(int guess){
        return guess-random;
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

         GuessNum a=new GuessNum();
         int guess,result;
         do{
             System.out.print("Guess the Number between 1-1000:");
             guess=input.nextInt();
             result=a.numGuess(guess);
             if(result==0){
                 System.out.println("Congrats! right guess");
             }else if(result>0){
                 System.out.println("Guess the lower number");
             }else if(result<0){
                 System.out.println("Guess the higher number");
             }
         }while(result!=0);
    }
}
