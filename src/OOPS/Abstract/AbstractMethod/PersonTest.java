package OOPS.Abstract.AbstractMethod;

public class PersonTest extends Person{
    PersonTest(String name){
        super(name);
    }

    @Override
    public void greet(){
    }

    public static void main(String[] args) {
     PersonTest person1=new PersonTest("Kuldeep");
     person1.greet();
    }
}
