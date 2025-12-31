package OOPS.Polymorphism.Challenge.Overriding;

public class Test {
    public static void main(String[] args){
    Car car=new Car();
    car.service();
    Vehicle vehicle=car;
    vehicle.service();
    Vehicle vehicle1=new Vehicle();
    vehicle1.service();

    System.out.print(vehicle.equals(car));
    }
}
