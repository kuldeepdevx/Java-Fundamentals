package Array.challenge;
import java.util.Scanner;

public class Search2D {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a num to find:");
        int[][] arr=new int[][]{{1,2},{4,5,6,7,8,9,10},{7,8,2,3,4,5,99}};
        System.out.print("Enter num to search:");
        int toSearch=input.nextInt();

        int i=0;
        while(i<arr.length){
            int j=0;
            while(j<arr[i].length){
                if(toSearch==arr[i][j]){
                    System.out.print("Num is present at ("+(i+1)+","+(j+1)+") index");
                    return;
                }
                j++;
            }
            i++;
        }
    }
}


