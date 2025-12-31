package Array.challenge;

public class Reverse {
    public static void main(String[] args){
        int[] arr={1,2,2,9,3,0,5};
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
        int k=0;
        while(k<arr.length){
            System.out.print(arr[k]+" ");
            k++;
        }
    }
}
