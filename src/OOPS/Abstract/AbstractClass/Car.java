package OOPS.Abstract.AbstractClass;

public class Car extends Vehicle {
    private String carName;

    Car(int tires){
        super(tires);
    }

    public void setName(String name){
        carName=name;
    }

    public String getName(){
        return this.carName;
    }

    @Override
    public void makeSound(){
        System.out.println("Vroommmm....");
    }

}
