package OOPS.Polymorphism.FinalKeyword;

public class Apple extends Fruit{

    final String varieties;

    Apple(String taste,String varieties){
        super(taste);
        this.varieties=varieties;
    }
}
