package Array.challenge;
import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int[] arr={1,2,2,1};
        boolean isPalindrome=isPalindrome(arr);
        if(isPalindrome){
            System.out.print("Array is a palindrome");
        }else{
            System.out.print("Array is not a palindrome");
        }
    }
    public static boolean isPalindrome(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
