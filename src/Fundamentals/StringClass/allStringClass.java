package Fundamentals.StringClass;
import java.util.Scanner;

public class allStringClass{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        subString.main(args);
    }
}
class equals {
    public static void main(String[] args){
        String one=new String("Kuldeep");
        String two="kuldeep";
        boolean strictCheck=one.equals(two);
        boolean content=one.equalsIgnoreCase(two);
        System.out.println(strictCheck+" "+content);
    }
}


class subString{
    public static void main(String[] args){
        String name="kuldeep";
        String newName;

        newName=name.substring(0,name.length());
        System.out.println(name+" "+newName);

        newName=name.substring(2);
        System.out.println(name+" "+newName);
    }
}
