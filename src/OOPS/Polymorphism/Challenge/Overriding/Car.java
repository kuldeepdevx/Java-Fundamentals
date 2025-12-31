package OOPS.Polymorphism.Challenge.Overriding;

public class Car extends Vehicle {
    @Override
    void service(){
        super.service();
        System.out.println("Car servce is done");
    }
}
