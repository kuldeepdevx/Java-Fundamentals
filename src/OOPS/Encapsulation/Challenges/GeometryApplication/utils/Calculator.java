package OOPS.Encapsulation.Challenges.GeometryApplication.utils;

import OOPS.Encapsulation.Challenges.GeometryApplication.geometry.Circle;
import OOPS.Encapsulation.Challenges.GeometryApplication.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args){

        Circle circle1=new Circle(1);
        Rectangle rectangle1=new Rectangle(10,10);

        System.out.println(circle1);
        System.out.println(rectangle1);
    }
}
