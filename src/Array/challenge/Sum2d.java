package Array.challenge;

public class Sum2d {
    public static void main(String[] args){
        int[][] arr=new int[][]{{1,2},{4,5,6,7,8,9},{7,8,2,3,4,5,99}};
        int i=0,count=0;
        float sum=0;
        while(i<arr.length){
            int j=0;
            while(j<arr[i].length){
                sum+=arr[i][j];
                j++;
                count++;
            }
            i++;
        }
        System.out.println(count);
        System.out.println("Sum of all 2D array elements is "+sum);
        System.out.print("Average of all 2D element is "+(sum/count));
    }
}


