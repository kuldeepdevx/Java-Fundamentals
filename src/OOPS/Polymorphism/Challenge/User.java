package OOPS.Polymorphism.Challenge;

public class User {

    int sum(int a,int b){
        return a-b;
    }
    int sum(double a,int b){
        return (int)(a-b);
    }
    public static void main(String[] args){
        User a=new User();

        a.sum(2,3);
        a.sum(2.0,3);
    }
}
