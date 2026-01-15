package OOPS.Polymorphism.FinalKeyword;

public class UserTest {
    public static void main(String[] args){

       final Fruit apple=new Apple("Sweet","Alphonso");
       apple.weight=4;
    }
}


//Final keyword
//-> variable value cannot be change
//-> method cannot be overridden
//-> final classes cannot be subclassed
//-> Object become immutable but object filed value can be change