package OOPS.Inheritance.Challenge.ARRAYOPERATION;
import java.util.Arrays;

public class ArrayClass {
    private int[] arr;

    public ArrayClass(int size){
        arr=new int[size];
    }

    public int[] getArr() {
        return arr;
    }

    void setValues(int[] protect){
        for(int i=0;i<arr.length&& i<protect.length;i++){
            arr[i]=protect[i];
        }
    }
    protected class arrayOperation{
        double mean(int[] arr) {
            double sum=0;
            for(int x:arr){
                sum+=x;
            }
            return sum/arr.length;
        }

        double median(int[] arr){
            Arrays.sort(arr);
            if(arr.length%2==0) {
                int x = (arr.length / 2) - 1;
                int y = x + 1;
                return ((double) (arr[x] + arr[y]))/2;
            }
            int x=arr.length/2;
            return arr[x];
        }
    }
}
