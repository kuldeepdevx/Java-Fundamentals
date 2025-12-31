//package Array.challenge;
//import java.util.Scanner;
//
//public class merge {
//    public static void main(String[] args){
//        Scanner input=new Scanner(System.in);
//
//        int[] arr=new int[]{4,5,2,6,0,-1,-1,4,-29292,23,23,4,2,4,2,2,4,2,4,2,};
//        int[] brr=new int[]{8,10,14,17,2,2,2,2,22,2,222,222,12};
//        int[] toMerge=doMerge(arr,brr);
//
//        int i=0;
//        while(i<toMerge.length){
//            System.out.print(toMerge[i]+" ");
//            i++;
//        }
//    }
//    public static int[] doMerge(int[] arr,int[] brr){
//        int[] toMerge=getElement(arr,brr);
//        int i=0;
//        while(i<toMerge.length-1){
//            int j=0;
//            while(j<toMerge.length-i-1){
//                if(toMerge[j]>toMerge[j+1]){
//                    int temp=toMerge[j];
//                    toMerge[j]=toMerge[j+1];
//                    toMerge[j+1]=temp;
//                }
//                j++;
//            }
//            i++;
//        }
//        return toMerge;
//    }
//    public static int[] getElement(int[] arr,int[] brr){
//        int[] merged=new int[arr.length+brr.length];
//        int i=0,j=0;
//        while(i<merged.length){
//            if(i<arr.length) {
//                merged[i] = arr[i];
//            }else {
//                merged[i]=brr[j];
//                j++;
//            }
//            i++;
//        }
//        return merged;
//    }
//}


package Array.challenge;

public class merge{
    public static void main(String[] args){
        int[] arr={2,4,1,2,3,4};
        int[] brr={1,3,5,7,9,11,12};
        int[] merge=domerge(arr,brr);
        int i=0;
        while(i<merge.length){
            System.out.print(merge[i]+" ");
            i++;
        }
    }
    public static int[] domerge(int[] arr,int[] brr){
        int i=0,j=0,k=0;
        int[] merged=new int[arr.length+brr.length];
        while(i<arr.length||j<brr.length){
            if(i==arr.length ||(j<brr.length&&arr[i]>brr[j])){
                merged[k]=brr[j];
                j++;
                k++;
            }else{
                merged[k]=arr[i];
                i++;
                k++;
            }
        }
        return merged;
    }
}