import java.util.*;

abstract class Emp {
    String name; double salary;
    Emp(String name,double salary){this.name=name;this.salary=salary;}
    abstract double bonus();
}

class Manager extends Emp {
    Manager(String name,double salary){super(name,salary);}
    double bonus(){ return salary*0.2; }
}
class Dev extends Emp {
    Dev(String name,double salary){super(name,salary);}
    double bonus(){ return salary*0.1; }
}
class Intern extends Emp {
    Intern(String name,double salary){super(name,salary);}
    double bonus(){ return salary*0.05; }
}

public class EmployeeManager {
    public static void main(String[] args){
        Emp e1=new Manager("Alice",50000);
        Emp e2=new Dev("Bob",30000);
        Emp e3=new Intern("Sam",10000);
        System.out.println(e1.name+" bonus: "+e1.bonus());
        System.out.println(e2.name+" bonus: "+e2.bonus());
        System.out.println(e3.name+" bonus: "+e3.bonus());
    }
}
