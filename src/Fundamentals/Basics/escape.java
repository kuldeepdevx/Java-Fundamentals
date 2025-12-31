package Fundamentals.Basics;

public class escape {
    public static void main(String[] args) {
        String myString="Kuldeep\trajput";
        String myString1="Kuldeep \brajput";
        String myString2="Kuldee\nrajput";
        System.out.println(myString);
        System.out.println(myString1);
        System.out.println(myString2);

        String x="kuldeep";
        String y=x+"\b";
        System.out.println(y);
    }
}
