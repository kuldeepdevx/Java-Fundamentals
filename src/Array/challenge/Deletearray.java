package Array.challenge;
import java.util.Scanner;

public class Deletearray {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a element to remove:");
        int toRemove=input.nextInt();
        int[] orignal=new int[]{1,2,3,4,5};
        orignal=toRemove(orignal,toRemove);
        int i=0;
        while(i<orignal.length){
            System.out.print(orignal[i]+" ");
            i++;
        }
    }
    public static int[] toRemove(int[] orignal,int toRemove) {
//        int i=0;
//        int count=0;
//        while(i<orignal.length){
//            if(toRemove!=orignal[i]){
//                count++;
//            }
//            i++;
//        }
//        int[] delete=new int[count];
//        int j=0,o=0;
//        while(j<orignal.length){
//            if(toRemove!=orignal[j]){
//                delete[o]=orignal[j];
//                o++;
//            }
//            j++;
//        }
//        return delete;
//    }
//}

        int i=0,j=0;
        while(i<orignal.length){
            if(orignal[i]!=toRemove){
                orignal[j]=orignal[i];
                j++;
            }
            i++;
        }
        int[] newa=new int[j];
        int input=0;
        while(input<newa.length){
            newa[input]=orignal[input];
            input++;
        }
        System.out.println();
        return newa;
      }
    }
