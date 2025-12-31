package OOPS.Encapsulation.Challenges.GeometryApplication.geometry;

public class Circle {
    public double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            System.out.println("!Invalid data");
        } else {
            this.radius = radius;
        }
    }

    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Area of circle is ");
        return sb.append(this.areaofCircle()).toString();
    }
        public double areaofCircle(){
            return Math.PI*Math.pow(this.radius,2);
        }
    }
