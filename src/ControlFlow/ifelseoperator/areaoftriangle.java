package ControlFlow.ifelseoperator;
import java.util.Scanner;

public class areaoftriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter height:");
        float height=sc.nextFloat();
        System.out.print("Enter base:");
        float base=sc.nextFloat();
        float area=1.0f/2*height*base;
        System.out.println("Area of triangle is:"+area);
    }
}
