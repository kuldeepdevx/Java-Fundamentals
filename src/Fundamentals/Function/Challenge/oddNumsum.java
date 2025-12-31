package Fundamentals.Function.Challenge;
import java.util.Scanner;

public class oddNumsum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a num:");
        int num=input.nextInt();
        int sum=sumofOdd(num);
        System.out.println("Sum of odd num is "+sum);
    }
    public static int sumofOdd(int num){
        if(num>=0) {
            int sum = 0;
            int i = 1;
            while (i <= num) {
                if (i % 2 != 0) {
                    sum += i;
                }
                i++;
            }
            return sum;
        }
        else{
            int i=-1;
            int sum=0;
            while(i>=num){
                sum+=i;
                i-=2;
            }
            return sum;
        }
    }
}
