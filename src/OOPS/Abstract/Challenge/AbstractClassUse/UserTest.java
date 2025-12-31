package OOPS.Abstract.Challenge.AbstractClassUse;

public class UserTest {
    public static void main(String[] args){
        Circle circle=new Circle(5);
        System.out.println(circle.calculateArea());

        Square square=new Square(5);
        System.out.printf("%.9f",square.calculateArea());
    }
}
