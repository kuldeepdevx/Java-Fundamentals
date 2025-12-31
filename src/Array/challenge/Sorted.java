package Array.challenge;
import java.util.Scanner;

public class Sorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {7,7,7,7,9};
        boolean isSorted = isSorted(arr);
        if(isSorted){
            System.out.print("Array is sorted");
        }else{
            System.out.print("Array is not sorted");
        }
    }

    public static boolean isSorted(int[] arr) {
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
