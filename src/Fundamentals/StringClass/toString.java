package Fundamentals.StringClass;

//Class for understand the toStirng()
class Person{
    String name;
    String skinTone;
    int height;
    int bankBalance;

    {
        this.bankBalance=0;
    }

    Person(String name,int height,String skinTone,int bankBalance){
        this.name=name;
        this.height=height;
        this.skinTone=skinTone;
        this.bankBalance=bankBalance;
    }

    Person(String name,int height){
        this(name,height,"Brown",0);
    }

        @Override
    public String toString() {
        return "Person[name="+this.name+
                ",Height="+this.height+
                ",skinTone="+this.skinTone+
                ",bankBalance="+this.bankBalance+"]";
    }

}
public class toString{
    public static void main(String[] args){
        Person first=new Person("Kuldeep",164,"Brown",1800000);
        System.out.println(first);
        Person second=new Person("k",23);
        System.out.println(second.toString());

    }
}