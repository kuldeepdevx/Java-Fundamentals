package Fundamentals.StringClass.Challenge;

class Student{
        String name;
        final int age;

        Student(String name,int age) {
            this.name = name;
            this.age = age;
        }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student Details:\n");
        sb.append("1.Name='").append(name);
        sb.append("'\n2.Age=").append(age);
        return sb.toString();
    }
}



public class UseOfToString{
    public static void main(String[] args){

        Student Kuldeep=new Student("Kuldeep",19);
        System.out.println(Kuldeep.toString());
    }
}
