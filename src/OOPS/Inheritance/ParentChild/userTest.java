package OOPS.Inheritance.ParentChild;

public class userTest extends FourWheeler {
    void show(){
        System.out.println("I am userTest");
    }
    public static void main(String[] args) {
        userTest c=new userTest();

        c.show();
    }
}
