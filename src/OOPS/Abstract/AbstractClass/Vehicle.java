package OOPS.Abstract.AbstractClass;

public abstract class Vehicle {
    private int noOftires;

    Vehicle(int tires){
        noOftires=tires;
    }

    public int getNoOftires(){
        return noOftires;
    }

    public void setnoOftires(int tires){
        noOftires=tires;
    }

    public void startEngine(){
        System.out.println("Car is started");
    }

    public abstract void makeSound();
}
