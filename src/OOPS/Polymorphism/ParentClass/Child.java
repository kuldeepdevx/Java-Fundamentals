package OOPS.Polymorphism.ParentClass;

public class Child extends Person{

    public void origin(){

    }
        public static Person get(){
        return new Child();
        }

        public int add(int a,double b){
        return (int)(a+b);
        }

        public String add(int a,int b){
        return "k";
        }

        public int add(double a,int b){
        return (int)(a+b);
        }

    public static void main(String[] args){
        Child child=new Child();
        Person person=new Person();

        Person person1=new Child();

        Person p1=Child.get();
        Child c;
        c=(Child)person1;
        person.origin();
        person1.origin();
        c.origin();
    }
}
