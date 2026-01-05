package OOPS.Encapsulation.Challenges.GeometryApplication.geometry;
import OOPS.Encapsulation.Challenges.GeometryApplication.utils.Calculator;

public class Circle{
    private  double radius;

    public Circle(double radius){
        if(!isValidRadius(radius)){
            System.out.println("Invalid data");
            this.radius=0;
            return;
        }
            this.radius = radius;
    }

    double calculateArea(){
        return Calculator.areaOfCircle(radius);
    }

    private static boolean isValidRadius(double radius){
        return radius>0;
    }
    @Override
    public String toString(){
        return "Area of circle is "+Calculator.areaOfCircle(radius);
    }
}