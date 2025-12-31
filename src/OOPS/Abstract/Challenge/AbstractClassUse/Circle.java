package OOPS.Abstract.Challenge.AbstractClassUse;

public class Circle extends Shape{

    private final double radius;

    Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double calculateArea(){
        return Math.pow(radius,2)*Math.PI;
    }

}
