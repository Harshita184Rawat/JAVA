package oops; 

class Student{

    // Data members
    String name;
    int age;
    String rollNo;
    String schoolname;

    // methods
    public void changeSname(String sName){
      this.name=sName;
    
}
}

public class Object{
    public static void main(String[] args) {
       
        // Object 1 of Student Class
        Student s1 = new Student();
        s1.name = "Ravi";
        s1.age = 18;
        s1.rollNo = "24CS01";
        System.out.println("Student 1 : "+s1.name+ " "+ s1.age+ " "+ s1.rollNo);
        
        // Object 2 of Student Class
        Student s2 = new Student();
        s2.name = "Harshita";
        s2.age = 20;
        s2.rollNo = "24CS02";
        System.out.println("Student 2 : "+s2.name+ " "+ s2.age+ " "+ s2.rollNo);

        // Changing name of s1
        s1.changeSname("Ravi Singh");
        System.out.println("Updated Name of Student 1: " + s1.name);
    }
}
