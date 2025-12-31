package Array.challenge;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int[] arr=takeInput(input);
        int findMax=findMax(arr);
        int findMin=findMin(arr);
        System.out.print(findMax+" is the maximum and "+findMin+" is the minimum element in array");
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
    public static int findMax(int[] arr){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        int i=0;
        int max=arr[0];
        while(i<arr.length){
            if(arr[i]>max){
                max=arr[i];
            }
            i++;
        }
        return max;
    }
    public static int findMin(int[] arr){
        if(arr.length==0){
            return Integer.MIN_VALUE;
        }
        int min=arr[0];
        int i=0;
        while(i<arr.length){
            if(arr[i]<min){
                min=arr[i];
            }
            i++;
        }
        return min;
    }
}
