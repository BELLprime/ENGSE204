package LAB5.LAB5p8;
//Superclass
class Person {
    protected String name ;
    public Person(String name) {
        this.name = name ;
    }
    public String getStatus () {
        return "Person: " + name ;
    }
}
//subclass 1
class Student extends Person {
    protected int studentId ;
    public Student (String name , int studentId) {
        super(name) ;
        this.studentId = studentId ;
    }
    @Override
    public String getStatus () {
        return "Student: " + this.name + ", ID:" + this.studentId ;
    }
}
//subclass 2
class Employee extends Person {
    protected double salary ;
    public Employee (String name , double salary) {
        super(name) ; 
        this.salary = salary ;
    }
    public void applyBonus(double bonus) {
        if (bonus > 0) {
            this.salary += bonus ;
        }
    }
    @Override 
    public String getStatus() {
        return "Employee: " + this.name + ", Salary:" + this.salary  ;
    }
}
