package Fundamentals.StringClass;

public class Stringbuilder {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("Hello");
        sb.insert(5," kuldeep");
        System.out.println(sb);

        sb.replace(13,13," Rajput");
        System.out.println(sb);

        sb.delete(6,14);
        System.out.println(sb);
    }
}
