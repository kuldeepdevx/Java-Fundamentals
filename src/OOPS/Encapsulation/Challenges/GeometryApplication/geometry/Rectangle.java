package OOPS.Encapsulation.Challenges.GeometryApplication.geometry;

public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        if (length <= 0 || breadth <= 0) {
            System.out.println("!Invalid data");
        } else {
            this.length = length;
            this.breadth = breadth;
        }
    }
    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Area of rectangle is ");
        return sb.append(this.areaofRectangle()).toString();
     }

    public double areaofRectangle() {
        return this.length * this.breadth;
    }
}
