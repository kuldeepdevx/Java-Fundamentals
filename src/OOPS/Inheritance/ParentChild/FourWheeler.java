package OOPS.Inheritance.ParentChild;

public class FourWheeler extends TwoWheeler {
    void show(){
        System.out.println("I am FourWheeler");
    }
    void kul(){
        System.out.println("Confusion");
    }

    public static void main(String[] args) {
        userTest a=new userTest();
        a.show();
        TwoWheeler ax=new FourWheeler();
        FourWheeler newax=(FourWheeler)ax;
        newax.kul();
    }
}
