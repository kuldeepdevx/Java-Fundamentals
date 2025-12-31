package OOPS.Inheritance.EqualsandHashcode;

public class Check {
    public static void main(String[] args) {
        Person person=new Person(19,"EC2151","Kuldeep");
        Person person1=new Person(19,"EC2151","Kuldeep");

        System.out.println(person.equals(person1));

        StringBuilder str=new StringBuilder("KUldeep");
        System.out.println(str.toString());
    }
}
