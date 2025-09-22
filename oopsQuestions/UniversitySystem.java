import java.util.*;

class Course {
    String code; String name;
    Course(String c,String n){code=c;name=n;}
}
class Student {
    String name; List<Course> courses=new ArrayList<>();
    Student(String n){name=n;}
    void enroll(Course c){courses.add(c);}
    void view(){System.out.println(name+" enrolled in: "); for(Course c:courses) System.out.println(c.code+" "+c.name);}
}
public class UniversitySystem {
    public static void main(String[] args){
        Student s=new Student("Gaurav");
        Course c1=new Course("CS101","Java");
        Course c2=new Course("CS102","DBMS");
        s.enroll(c1); s.enroll(c2);
        s.view();
    }
}
