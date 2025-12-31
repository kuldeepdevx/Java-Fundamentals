package Array.challenge;

public class Diagonal {
    public static void main(String[] args){
        int[][] arr=new int[][]{{1,2},{3,4}};
        int i=0,sum=0;
        while(i<arr.length){
            int j=0;
            while(j<arr[i].length){
                if(i==j || ((i==0 && j==1) || (i==1 && j==0))){
                    sum+=arr[i][j];
                }
                j++;
            }
            i++;
        }
        System.out.print("Sum of diagonal elements is "+sum);
        }
    }


