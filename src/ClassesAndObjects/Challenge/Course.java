package ClassesAndObjects.Challenge;

class Course{
    static int maxCapacity=100;
    String courseName;
    int enrolledStudent;
    Course(String course){
        this.courseName=course;
    }
    String[] noOfStudent=new String[maxCapacity];
    void toEnrolledStudent(String name){
        if(enrolledStudent>=noOfStudent.length){
            System.out.println("Sorry course is full");
        }else {
            this.noOfStudent[enrolledStudent] = name;
            System.out.println("Addmission done for " + name + " in " + this.courseName);
            enrolledStudent++;
        }
    }
    void toUnenrolledStudent(String name){
        if(enrolledStudent<=0){
            System.out.println("Already canceled");
        }else {
            System.out.println("Addmission cancel for " + name + " in " + this.courseName);
            enrolledStudent--;
        }
    }
    int getMaxCapacity(int capacity){
        maxCapacity=capacity;
        String[] copy=noOfStudent;
        noOfStudent=new String[maxCapacity];
        toCopy(copy);
        return maxCapacity;
    }
    void toCopy(String[] copy){
        int i=0;
        while(i<copy.length&&copy[i]!=null){
            this.noOfStudent[i]=copy[i];
            i++;
        }
    }
}



class makecourse{
    public static void main(String[] args) {
        Course Ece = new Course("ECE");
        System.out.println(Ece.courseName);
        System.out.println(Ece.noOfStudent.length);
        Ece.toEnrolledStudent("Rahul");
        System.out.println(Ece.noOfStudent[0]);
        Ece.getMaxCapacity(120);
        Ece.toEnrolledStudent("kuldeep");
        Ece.toUnenrolledStudent("Jay");
        Ece.toUnenrolledStudent("Jay");
        Ece.toUnenrolledStudent("Jay");
        Ece.toUnenrolledStudent("Kuldeep");
        System.out.println(Ece.enrolledStudent);
        System.out.println(Ece.getMaxCapacity(1000000));
    }
}



























