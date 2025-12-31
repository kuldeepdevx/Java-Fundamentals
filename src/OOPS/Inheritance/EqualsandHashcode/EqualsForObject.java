package OOPS.Inheritance.EqualsandHashcode;

class Person{
    private String name;
    private int age;
    private String id;

    public Person(int age, String id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(!(obj instanceof Person)){
            return false;
        }
        Person check=(Person)obj;
        return check.name.equals(name)&&
                check.age==age &&
                check.id.equals(id);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
