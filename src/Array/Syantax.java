package Array;
import java.util.Scanner;

public class Syantax {
    static {
        System.out.println("int sattic!");
    }
    {
        System.out.println("in init");
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int[] arr=new int[]{1,2,3,4,5};
        System.out.print("Enter a num to search:");
        int target=input.nextInt();
        boolean isFound=isFound(arr,target);
        if(isFound){
            System.out.print(target+" is present in array");
        }else {
            System.out.print(target + " is not present in array");
        }
    }
    public static boolean isFound(int[] arr,int target){
        int i=0;
        while(i<arr.length){
            if(arr[i]==target){
                return true;
            }
            i++;
        }
        Syantax my=new Syantax();
        return false;
    }
}
