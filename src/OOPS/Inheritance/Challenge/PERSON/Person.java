package OOPS.Inheritance.Challenge.PERSON;

import java.util.Objects;

public class Person {
    private String name;
    private double age;

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        if (!isValid(age)) {
            System.out.println("Age is invalid");
            return;
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!isValid(name)) {
            System.out.println("Name is invalid");
            return;
        }
        this.name = name;
    }

    private boolean isValid(String name) {
        return name != null && !(name.trim().isEmpty());
    }

    private boolean isValid(double age) {
        return age > 0;
    }
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return Double.compare(age, person.age) == 0 && Objects.equals(name, person.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Person person)) {
            return false;
        }
        return Double.compare(age, person.age) == 0
                && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
