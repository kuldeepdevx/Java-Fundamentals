package Array.challenge;
import java.util.Scanner;

public class Averageofelements {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter size of array:");
        int num=input.nextInt();
        int[] arr=new int[num];
        arr=takeInput(arr,input);
        int sum=findSum(arr);
        float average=findAverage(arr);
        System.out.println(sum);
        System.out.println(average);
    }
    public static int[] takeInput(int[] arr,Scanner input){
        int i=0;
        while(i<arr.length){
            System.out.print("Enter "+(i+1)+" element of array:");
            arr[i]=input.nextInt();
            i++;
        }
        return arr;
    }
    public static int findSum(int[] arr){
        int sum=0;
        int i=0;
        while(i<arr.length){
            sum+=arr[i];
            i++;
        }
        return sum;
    }
    public static float findAverage(int[] arr){
        float average=0;
        int i=0;
        while(i<arr.length){
            average+=arr[i];
            i++;
        }
        return average/arr.length;
    }
}
