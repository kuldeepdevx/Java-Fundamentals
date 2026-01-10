package OOPS.Inheritance.Challenge.PERSON;

public class Tester {
    public static void main(String[] args){
        Person person1=new Person();
        person1.setAge(20);
        person1.setName("Virat");

        Person person2=new Person();
        person2.setAge(20);
        person2.setName("Virat");

        System.out.println(person1.equals(person2));

        Person person3=new Person();
        person3.setAge(25);
        person3.setName("Mandeep");

        Person person4=new Person();
        person4.setAge(18);
        person4.setName("Krishna");

        System.out.println(person3.equals(person4));
    }
}
