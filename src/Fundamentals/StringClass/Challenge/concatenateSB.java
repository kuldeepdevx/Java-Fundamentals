package Fundamentals.StringClass.Challenge;

public class concatenateSB {
    public static void main(String[] args){
        String[] word=new String[]{"My",
                "name","is","kuldeep"};
        StringBuilder con=new StringBuilder();

        for(String newWord:word){
            con.append(newWord).append(" ");
        }
        System.out.println(con);
    }
}
