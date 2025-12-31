package Fundamentals.StringClass.Challenge;
import java.util.Scanner;

class Circle {

    double radius;

    Circle(double radius){
        this.radius=radius;
    }

    double getCircumference(){
        return 2*Math.PI*radius;
    }

    double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle radius is "+radius+"\nCircumference of circle"+
                "is "+getCircumference()+
                "\nArea of circle is "+getArea();
    }

    public static void main(String[] args){
        Scanner input =new Scanner(System.in);

            System.out.print("Enter radius:");
            double radius=input.nextFloat();

            Circle prop=new Circle(radius);

            System.out.print(prop);
    }
}
