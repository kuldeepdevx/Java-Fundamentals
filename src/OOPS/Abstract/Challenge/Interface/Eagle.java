package OOPS.Abstract.Challenge.Interface;

public class Eagle extends Bird{

    @Override
    public void who() {
        System.out.println("I am Eagle");
    }

    @Override
    public void fly(){
        System.out.println("I am flying");
    }
}
