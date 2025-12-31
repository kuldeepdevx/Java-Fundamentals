package Array.challenge;
import java.util.Scanner;

public class Occurence {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int[] arr=takeInput(input);
        System.out.print("Enter num to find his occurence:");
        int findNum=input.nextInt();
        System.out.print(findNum+" is occurining "+(findNum(findNum,arr))+" times");
    }
    public static int[] takeInput(Scanner input){
        System.out.print("Enter size of array:");
        int size=input.nextInt();
        int[] arr=new int[size];

        int i=0;
         while(i<arr.length){
             System.out.print("Enter "+(i+1)+" element of array:");
             arr[i]=input.nextInt();
             i++;
         }
        return arr;
    }
    public static int findNum(int findNum,int[] arr){
        int i=0;
        int count=0;
        while(i<arr.length){
            if(findNum==arr[i]){
                count++;
            }
            i++;
        }
        return count;
    }
}
