package OOPS.Encapsulation.Challenges.EMPLOYEE;

public class Employee {
    public static int totalEmployees;
    private String name;
    private double age;
    private double salary;

    public Employee(String name,double salary,double age){
        if( (name == null || name.trim().isEmpty()) ||
            (age<18 || age>56) || salary<=0){
            System.out.println("Invalid employee details.");
            return;
        }
            this.name = name;
            this.age = age;
            this.salary = salary;
            totalEmployees++;
    }

    public void setName(String name){
       if(name == null || name.trim().isEmpty()){
           return;
       }
        this.name=name;
    }

    public void setAge(double age) {
        if(age<18 || age>56){
            System.out.println("Age is not eligible.");
            return;
        }
        this.age = age;
    }

    public void setSalary(double salary){
        if(salary<=0){
            System.out.println("Invalid salary amount.");
            return;
        }
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

    public String seeEmployeeDetails(){
        return "Employee Details["+
                "Name="+name+",Age="+age+
                ",Salary="+salary+"]\n";
    }
}
