package ClassesAndObjects.ObjectCreation;

//public class Driver {
//    public static void main(String[] args){
//        Car thar=new Car("red");
//        thar.addFuel(7);
//        thar.start().drive();
//        thar.addFuel(6);
//        Car startedcar=thar.start();
//       System.out.print(startedcar.start().drive().addFuel(8));
//    }
//}

import java.util.Scanner;
import java.util.Arrays;

class code{


    public static void main(String[] args){
        String s="abcde";
        String[] S=new String[]{"a","bb","acd","ace"};
        int count=0;
        for(int i=0;i<S.length;i++){
            if(s.toLowerCase().contains(S[i].toLowerCase()))
                count++;

        }
        System.out.println(count);
    }
}
