package OOPS.Encapsulation.Challenges.EMPLOYEE;

public class Employee {
    private String name;
    private double age;
    private double salary;

    Employee(String name,double salary,double age){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    Employee(String name,double salary){
        this(name,18,salary);
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public String getName(){
        return name;
    }


    public double getSalary(){
        return salary;
    }

    public double getAge(){
        return age;
    }

    String seeEmployeeDetails(){
        return "Employee Details["+
                "Name="+name+",Age="+age+
                ",Salary="+salary+"]";
    }
}
