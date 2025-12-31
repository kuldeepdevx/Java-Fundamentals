package ClassesAndObjects.ObjectCreation;

public class Constructor {
    int noOfWheels;
    String colour;
    float maxSpeed;
    float currentFuel;
    int noOfSeats;
    Constructor(String colour){
        noOfWheels=4;
        this.colour=colour;
        maxSpeed=150;
        currentFuel=2;
        noOfSeats=4;
    }
    Constructor(){      //constructor chaining
        this("Black");
        currentFuel+=5;
    }
    public static void main(String[] args){
        Constructor myConstructor1=new Constructor("red");
        Constructor myConstructor2=new Constructor();
        Constructor a=myConstructor1;
        Constructor b=myConstructor1;
        System.out.println(myConstructor1.colour+" "+myConstructor1.currentFuel);
        System.out.println(myConstructor2.colour+" "+myConstructor2.currentFuel);

    }
}
