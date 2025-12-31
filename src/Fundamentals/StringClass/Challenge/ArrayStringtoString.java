package Fundamentals.StringClass.Challenge;

public class ArrayStringtoString{
    public static void main(String[] args){

        String[] word=new String[]{"My",
                "Name","is","Kuldeep"};

        StringBuilder sb=new StringBuilder();

        for(String x:word){
            sb.append(x+" ");
            System.out.println(sb);
        }
    }
}
