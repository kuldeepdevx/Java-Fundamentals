package ClassesAndObjects.ObjectCreation;

public class Car {
   int noOfWheels;
   String colour;
   float maxSpeed;
   float currentFuel;
   int noOfSeats;

   Car(String colour){
       this.colour=colour;
   }

   public Car start(){
       if(currentFuel==0){
           System.out.println("Please refuel the car");
       }else if(currentFuel<5){
           System.out.println("Car is in reserved mode refuel the fuel");
       }else {
           System.out.println("car is started");
           currentFuel--;
       }
       return this;
   }

   public Car drive(){
       System.out.println("car is driving");
       return this;
    }

    public float addFuel(float currentFuel){
       this.currentFuel+=currentFuel;
       return this.currentFuel;
    }
    public float getFuel(){
       return currentFuel;
    }
}




