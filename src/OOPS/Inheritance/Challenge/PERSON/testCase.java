package OOPS.Inheritance.Challenge.PERSON;

public class testCase {
    public static void main(String[] args){
        Person person1=new Person();
        person1.setAge(18);
        person1.setName("Kuldeep");

        Person person2=new Person();
        person2.setAge(18);
        person2.setName("Kuldeep");

        System.out.println(person1.equals(person2));
    }
}
